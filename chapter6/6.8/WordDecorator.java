import java.io.*;
import java.util.ArrayList;
public class WordDecorator extends Decorator{
    File decoratorFile;
    WordDecorator(ReadWord reader,File decoratorFile){
       super(reader);
       this.decoratorFile=decoratorFile;
    }
    public ArrayList<String> readWord(File file){
       ArrayList<String> wordList=reader.readWord(file);
       try{
            FileReader  inOne=new FileReader(decoratorFile);
            BufferedReader inTwo= new BufferedReader(inOne);
            String s=null;
            int m=0;
            while((s=inTwo.readLine())!=null){
               String word=wordList.get(m); 
               word=word.concat(" | "+s);
               wordList.set(m,word);
               m++;
               if(m>wordList.size()) break;
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