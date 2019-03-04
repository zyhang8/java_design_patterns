import java.io.*;
import java.util.regex.*;
public class HaiGui implements Observer{
   Subject subject;
   File myFile;  
   HaiGui(Subject subject,String fileName){
      this.subject=subject;
      subject.addObserver(this);    
      myFile=new File(fileName);
   }
   public void hearTelephone(String heardMess){
      try{ boolean boo=heardMess.contains("java程序员")||heardMess.contains("软件");
           if(boo){ 
             RandomAccessFile out=new RandomAccessFile(myFile,"rw");  
             out.seek(out.length());
             byte [] b=heardMess.getBytes();
             out.write(b); 
             System.out.print("我是一个海归,"); 
             System.out.println("我向文件"+myFile.getName()+"写入如下内容:");
             System.out.println(heardMess);
           }
           else{
              System.out.println("我是海归,这次的信息中没有我需要的信息");
           } 
      }
      catch(IOException exp){
          System.out.println(exp.toString());
      }
  } 
}
