import java.util.*;
import java.io.*;
public  class WordSortTemplate extends WordsTemplate{
      WordSortTemplate(File file){
           super(file);
      }
      public  void sort(String [] word){
           Arrays.sort(word); 
      }
}
