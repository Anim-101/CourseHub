import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.security.*;

public class Register extends JPanel implements ActionListener
{
  JLabel userLabel = new JLabel("Username: ");
  JTextField userTextField = new JTextField();

  JLabel passwordLabel = new JLabel("Password: ");
  JPasswordField passwordField = new JPasswordField();

  JLabel confirmPasswordLabel = new JLabel("Confirm Password: ");
  JPasswordField confirmPasswordField = new JPasswordField();

  JButton registerButton = new JButton("Register");
  JButton backButton = new JButton("Back");

  public Register()
  {
    JPanel registerPanel = new JPanel();

    registerPanel.setLayout(new GridLayout(4, 2));

    registerPanel.add(userLabel);
    registerPanel.add(userTextField);
    registerPanel.add(passwordLabel);
    registerPanel.add(passwordField);
    registerPanel.add(confirmPasswordLabel);
    registerPanel.add(confirmPasswordField);

    backButton.addActionListener(this);
    registerButton.addActionListener(this);

    registerPanel.add(registerButton);
    registerPanel.add(backButton);


    add(registerPanel);
  }

  public void actionPerformed(ActionEvent actionEvent)
  {
    if(actionEvent.getSource() == registerButton && passwordField.getPassword().length > 0 && userTextField.getText().length() > 0)
    {
      String password = new String(passwordField.getPassword());

      String confirmedPassword = new String(confirmPasswordField.getPassword());

      if(password.equals(confirmedPassword))
      {
        try
        {
          BufferedReader input = new BufferedReader(new FileReader("password.txt"));

          String line = input.readLine();

          while(line != null)
          {
            StringTokenizer stringToken = new StringTokenizer(line);

            if(userTextField.getText().equals(stringToken.nextToken()))
            {
              System.out.println("User Already Exists");

              return;
            }

            line = input.readLine();
          }

          input.close();

          MessageDigest message = MessageDigest.getInstance("SHA-256");

          message.update(password.getBytes());

          byte byteInfo [] = message.digest();

          StringBuffer stringBuffer = new StringBuffer();

          for(int i = 0; i < byteInfo.length; i++)
          {
            stringBuffer.append(Integer.toString((byteInfo[i] & 0xFF) + 0x100, 16).substring(1));
          }

          BufferedWriter output = new BufferedWriter(new FileWriter("password.txt", true));

          output.write(userTextField.getText() + " " + stringBuffer.toString() + "\n");

          output.close();

          LogIn login = (LogIn) getParent();

          login.cardLayout.show(login, "login");
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
    }

    if(actionEvent.getSource() == backButton)
    {
      LogIn login = (LogIn) getParent();

      login.cardLayout.show(login, "login");
    }
  }
}
