import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Invoke{
  JButton button;             
  Command command;
  Invoke(){
     button=new JButton();
     button.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                executeCommand();
              }
            });
  }
  public void setCommand(Command command){
     this.command=command;
     button.setText(command.getName()); 
  }
  public JButton getButton(){
     return button;
  }
  private void executeCommand(){   
     command.execute();
  }
}
