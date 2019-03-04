import java.io.*;
import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public  class ConcreteTemplate1 extends  AbstractTemplate{
       ConcreteTemplate1(File dir){
           super(dir);
      }
      public void sort(){
           for(int i=0;i<allFiles.length;i++)
                for(int j=i+1;j<allFiles.length;j++)
                      if(allFiles[j].lastModified()<allFiles[i].lastModified()){
                            File file=allFiles[j];
                            allFiles[j]=allFiles[i];
                            allFiles[i]=file;
                      }
      }
      public void printFiles(){
             for(int i=0;i<allFiles.length;i++){
                 long time=allFiles[i].lastModified();
                 Date date=new Date(time);
                 SimpleDateFormat matter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 String str=matter.format(date);
                 String name=allFiles[i].getName();
                 int k=i+1;
                 System.out.println(k+" "+name+"("+str+")");
            }
      }
}
