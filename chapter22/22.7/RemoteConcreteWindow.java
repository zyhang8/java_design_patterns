import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class  RemoteConcreteWindow extends UnicastRemoteObject
implements RemoteWindow,ActionListener{
     JFrame  window;
     JTextArea text;
     JButton open,save;
     JFileChooser fileChooser;
     RemoteConcreteWindow() throws RemoteException{
           window=new JFrame();
           text=new JTextArea();
           open=new JButton("´ò¿ª");
           open.addActionListener(this);
           save=new JButton("±£´æ");
           fileChooser=new JFileChooser("c:/");
           JPanel panel=new JPanel();
           panel.add(open);
           panel.add(save);
           window.add(text,BorderLayout.CENTER);
           window.add(panel,BorderLayout.SOUTH);
           window.setSize(300,300);
    }
    public JFrame getWindow() throws RemoteException{
           return window;
    }
    public void actionPerformed(ActionEvent e){
          if(e.getSource()==open){
              text.setText(null);
              int n=fileChooser.showOpenDialog(null);
              if(n==JFileChooser.APPROVE_OPTION){
                   File file=fileChooser.getSelectedFile();
                   try{  FileReader readfile=new FileReader(file); 
                          BufferedReader in=new BufferedReader(readfile);
                          String s=null;
                          while((s=in.readLine())!=null)
                              text.append(s+"\n");
                  }
                  catch(IOException ee){}
              }
         }
         if(e.getSource()==save){
              int n=fileChooser.showSaveDialog(null);
              if(n==JFileChooser.APPROVE_OPTION){
                   File file=fileChooser.getSelectedFile();
                   try{   FileWriter outOne=new FileWriter(file); 
                            BufferedWriter outTwo=new BufferedWriter(outOne);
                            outTwo.write(text.getText());
                  }
                  catch(IOException ee){}
              }
         }
}

