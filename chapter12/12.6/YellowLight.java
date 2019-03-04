import javax.swing.*;
import java.awt.Font;
public class YellowLight extends JLabel{
   ImageIcon onIcon,offIcon;
   YellowLight(){
      onIcon=new ImageIcon("onYellow.jpg");
      offIcon=new ImageIcon("offYellow.jpg");
      setHorizontalTextPosition(AbstractButton.CENTER);
      setVerticalTextPosition(AbstractButton.CENTER);
      setFont(new Font("ËÎÌå",Font.BOLD,11));    
   }
   public void on(){
      setIcon(onIcon);
      setText("»ÆµÆÁÁ");
   }
   public void off(){
      setIcon(offIcon);
      setText("»ÆµÆÃð");
   }
}