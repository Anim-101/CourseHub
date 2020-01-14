import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Editor extends JPanel implements ActionListener
{
  File file;

  JButton saveButton = new JButton("Save");
  JButton saveCloseButton = new JButton("Save & Close");

  JTextArea textArea = new JTextArea(20, 40);

  public Editor(String string)
  {
    file = new File(string);

    saveButton.addActionListener(this);
    saveCloseButton.addActionListener(this);

    if(file.exists())
    {
      try
      {
        BufferedReader input = new BufferedReader(new FileReader(file));

        String line = input.readLine();

        while(line != null)
        {
          textArea.append(line + "\n");

          line = input.readLine();
        }

        input.close();
      }
      catch(IOException exceptionOne)
      {
        exceptionOne.printStackTrace();
      }
    }

    add(saveButton);
    add(saveCloseButton);
    add(textArea);
  }

  public void actionPerformed(ActionEvent actionEvent)
  {
    try
    {
      FileWriter out = new FileWriter(file);

      out.write(textArea.getText());

      out.close();

      if(actionEvent.getSource() == saveCloseButton)
      {
        LogIn login = (LogIn) getParent();

        login.cardLayout.show(login, "fileBrowser");
      }
    }
    catch(IOException exceptionOne)
    {
      exceptionOne.printStackTrace();
    }
  }
}
