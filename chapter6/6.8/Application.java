import java.util.ArrayList;
import java.io.File;
public class Application{
   public static void main(String args[]){
      ArrayList<String> wordList=new ArrayList<String>();
      ReadEnglishiWord REW=new ReadEnglishiWord();
      WordDecorator WD1=new WordDecorator(REW,new File("chinese.txt"));
      ReadWord reader=WD1;    
      wordList=reader.readWord(new File("word.txt"));
      for(int i=0;i<wordList.size();i++){
          System.out.println(wordList.get(i));
      }
      WordDecorator WD2=new WordDecorator(WD1,new File("englishSentence.txt"));
      reader=WD2;    
      wordList=reader.readWord(new File("word.txt"));
      for(int i=0;i<wordList.size();i++){
          System.out.println(wordList.get(i));
      }
   }
}
 
  
