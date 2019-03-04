import javax.swing.*;
public class Camera extends JPanel{
   String name;
   Icon imageIcon;
   JLabel label;
   public Camera(){
     label=new JLabel("Œ“ «…„œÒÕ∑"); 
     add(label); 
   }
   public void on(){
      label.setIcon(new ImageIcon("cameraOpen.jpg")); 
   }
   public void off(){
      label.setIcon(new ImageIcon("cameraClosed.jpg"));
   }
}
