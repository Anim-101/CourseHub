import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileBrowser extends JPanel implements ActionListener
{
  JLabel fileListLabel = new JLabel("File List: ");

  JButton newFileButton = new JButton("New File");
  JButton openButton = new JButton("Open");

  JTextField textField = new JTextField(10);

  ButtonGroup buttonGroup;

  File fileDirectory;

  public FileBrowser(String directory)
  {
    fileDirectory = new File(directory);

    fileDirectory.mkdir();

    JPanel fileListPanel = new JPanel(new GridLayout(fileDirectory.listFiles().length + 3, 1));

    fileListPanel.add(fileListLabel);

    buttonGroup = new ButtonGroup();

    for(File file : fileDirectory.listFiles())
    {
      JRadioButton radio = new JRadioButton(file.getName());

      radio.setActionCommand(file.getName());

      buttonGroup.add(radio);

      fileListPanel.add(radio);
    }

    JPanel textFilePanel = new JPanel();

    textFilePanel.add(textField);
    textFilePanel.add(newFileButton);

    fileListPanel.add(openButton);
    fileListPanel.add(textFilePanel);

    openButton.addActionListener(this);
    newFileButton.addActionListener(this);

    add(fileListPanel);
  }

  public void actionPerformed(ActionEvent actionEvent)
  {
    LogIn login = (LogIn) getParent();

    if(actionEvent.getSource() == openButton)
    {
      login.add(new Editor(fileDirectory.getName() + "\\" + buttonGroup.getSelection().getActionCommand()), "editor");

      login.cardLayout.show(login, "editor");
    }

    if(actionEvent.getSource() == newFileButton)
    {
      String file = fileDirectory.getName() + "\\" + textField.getText() + ".txt";

      if(textField.getText().length() > 0 && !(new File(file).exists()))
      {
        login.add(new Editor(file), "editor");

        login.cardLayout.show(login, "editor");
      }
    }
  }
}
