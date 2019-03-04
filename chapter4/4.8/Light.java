import javax.swing.*;
public class Light extends JPanel{
   String name;
   Icon imageIcon;
   JLabel label;
   public Light(){
     label=new JLabel("Œ“ «’’√˜µ∆");
     add(label);  
   }
   public void on(){
      label.setIcon(new ImageIcon("lightOpen.jpg")); 
   }
   public void off(){
      label.setIcon(new ImageIcon("lightClosed.jpg")); 
   }
}
