import javax.swing.*;
public class ClientUseButton extends JFrame{
   JButton button;
   Command command;
   Invoke person;
   public ClientUseButton(){
      person=new Invoke();       //创建请求者,其中含有我们需要的按钮
      command=new MultiCommand(new ShowMultForm());
      person.setCommand(command); 
      JFrame frame=new JFrame();
      frame.setLayout(new java.awt.FlowLayout());
      button=person.getButton();
      frame.add(button);
      frame.setSize(200,200);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void setCommand(Command command){
      person.setCommand(command);
  }
  public static void main(String args[]){
      ClientUseButton win=new ClientUseButton();
 }
}
