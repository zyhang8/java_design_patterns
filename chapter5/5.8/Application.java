import javax.swing.*;
import java.awt.*;
public class Application extends JFrame{
   Application(){
      InputTextSubject textSubject=new InputTextSubject();               
      ShowWord  observerOne=new ShowWord(textSubject);     
      ShowDigit observerTwo=new ShowDigit(textSubject);    
      setLayout(new FlowLayout());
      add(new JScrollPane(textSubject.getJTextArea()));
      add(observerOne);
      add(observerTwo);
      setBounds(20,20,400,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String args[]){
      new Application();
  }
}
