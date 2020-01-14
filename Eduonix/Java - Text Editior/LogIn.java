import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.security.*;

public class LogIn extends JPanel implements ActionListener
{
  JLabel userLabel = new JLabel("UserName: ");
  JTextField userTextField = new JTextField();

  JLabel passwordLabel = new JLabel("Password: ");
  JPasswordField passwordField = new JPasswordField();

  JPanel loginPanel = new JPanel(new GridLayout(3, 2));
  JPanel panel = new JPanel();

  JButton loginButton = new JButton("Login");
  JButton registerButton = new JButton("Register");

  CardLayout cardLayout;

  LogIn()
  {
    setLayout(new CardLayout());

    loginPanel.add(userLabel);
    loginPanel.add(userTextField);
    loginPanel.add(passwordLabel);
    loginPanel.add(passwordField);

    loginButton.addActionListener(this);
    registerButton.addActionListener(this);

    loginPanel.add(loginButton);
    loginPanel.add(registerButton);

    panel.add(loginPanel);

    add(panel, "login");

    cardLayout = (CardLayout) getLayout();
  }

  public void actionPerformed(ActionEvent actionEvent)
  {
    if(actionEvent.getSource() == loginButton)
    {
      try
      {
        BufferedReader input = new BufferedReader(new FileReader("password.txt"));

        String password = null;

        String line = input.readLine();

        while(line != null)
        {
          StringTokenizer stringToken = new StringTokenizer(line);

          if(userTextField.getText().equals(stringToken.nextToken()))
          {
            password = stringToken.nextToken();
          }

          line = input.readLine();
        }

        input.close();

        MessageDigest message = MessageDigest.getInstance("SHA-256");

        message.update(new String(passwordField.getPassword()).getBytes());

        byte byteInfo[] = message.digest();

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < byteInfo.length; i++)
        {
          stringBuffer.append(Integer.toString((byteInfo[i] & 0xFF) + 0x100, 16).substring(1));
        }

        if(password.equals(stringBuffer.toString()))
        {
          add(new FileBrowser(userTextField.getText()), "fileBrowser");

          cardLayout.show(this, "fileBrowser");
        }

      }
      catch(FileNotFoundException exceptionOne)
      {
        exceptionOne.printStackTrace();
      }
      catch(IOException exceptionTwo)
      {
        exceptionTwo.printStackTrace();
      }
      catch(NoSuchAlgorithmException exceptionThree)
      {
        exceptionThree.printStackTrace();
      }
    }

    if(actionEvent.getSource() == registerButton)
    {
      add(new Register(), "register");

      cardLayout.show(this, "register");
    }
  }

  public static void main(String [] args)
  {
    JFrame frame = new JFrame("Text Editor");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(500, 500);

    LogIn login = new LogIn();

    frame.add(login);

    frame.setVisible(true);
  }
}
