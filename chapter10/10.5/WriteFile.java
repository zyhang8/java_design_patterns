import java.io.*;
public class WriteFile{
    public void writeToFile(String fileName,String content){
        StringBuffer str=new StringBuffer();
        try{ StringReader inOne=new StringReader(content);
             BufferedReader inTwo=new BufferedReader(inOne); 
             FileWriter outOne=new FileWriter(fileName);
             BufferedWriter outTwo= new BufferedWriter(outOne);
             String s=null;
             while((s=inTwo.readLine())!=null){ 
                outTwo.write(s);
                outTwo.newLine();
                outTwo.flush();
             }
             inOne.close();
             inTwo.close();
             outOne.close();
             outTwo.close();
        }
        catch(IOException exp){System.out.println(exp);}
    }
}
