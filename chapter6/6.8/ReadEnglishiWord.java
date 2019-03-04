import java.io.*;
import java.util.ArrayList;
public class ReadEnglishiWord extends ReadWord{
    public ArrayList<String> readWord(File file){
       ArrayList<String> wordList=new ArrayList<String>();
       try{
            FileReader  inOne=new FileReader(file);
            BufferedReader inTwo= new BufferedReader(inOne);
            String s=null;
            while((s=inTwo.readLine())!=null){
               wordList.add(s);
            }
            inTwo.close();
            inOne.close();
       } 
       catch(IOException exp){
            System.out.println(exp);
       } 
       return wordList;
   }
}