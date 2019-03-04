import javax.swing.*;
import java.net.*;
import java.awt.*;
public class ImageIconProxy implements Icon,Runnable{
       ImageIcon icon;
       URL imageURL;
       Thread loadImage;
       Component c;
       Graphics g; 
       int x,y,w=200,h=200;
       ImageIconProxy(URL imageURL){
             this.imageURL=imageURL;
             loadImage=new Thread(this);
       }
       public int getIconHeight(){
            if(icon!=null)
                   h=icon.getIconHeight();
            return h;
       }
       public int getIconWidth(){
            if(icon!=null)
                  w=icon.getIconWidth();
            return w;
      }
      public void paintIcon(Component c,Graphics g,int x,int y){
           if(icon!=null){
                  if(icon.getImageLoadStatus()==MediaTracker.COMPLETE)
                       icon.paintIcon(c,g,x,y);
                  else  
                      doWork(c,g,x,y);
            }
           else   
                 doWork(c,g,x,y);
       }
      private void doWork(Component c,Graphics g,int x,int y){
             g.drawString("«Î…‘µ»...",200,150);
             this. c=c;
             this.g=g;
             this.x=x;
             this.y=y;
             if(!loadImage.isAlive()){
                    loadImage=new Thread(this);
             }
             try{
                    loadImage.start();
             }
             catch(Exception exp){}
      }
      public void run(){
           try{  icon=new ImageIcon(imageURL);
                    if(icon.getImageLoadStatus()==MediaTracker.COMPLETE)
                           c.repaint(); 
           }
           catch(Exception exp){}
      }
}