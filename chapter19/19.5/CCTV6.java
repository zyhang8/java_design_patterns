import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public  class  CCTV6 extends CCTV implements Runnable{
     JLabel showFilm;
     Thread thread;
     ArrayList<String> content;
     CCTV6(Program program){
           programMaker=program; 
           setLayout(new BorderLayout());
           showFilm=new JLabel("CCTV6µÁ”∞∆µµ¿");
           showFilm.setFont(new Font("",Font.BOLD,39));
           add(showFilm,BorderLayout.CENTER);
           thread=new Thread(this);
    } 
     public void makeProgram (){
           content=programMaker.makeTVProgram();
           if(!thread.isAlive()){
                thread=new Thread(this);
                thread.start();  
           }
     }
     public void run(){
           for(int i=0;i<content.size();i++){
                showFilm.setText(content.get(i)); 
                try{  Thread.sleep(1500);
                }
                catch(InterruptedException exp){}
           }
     }
}