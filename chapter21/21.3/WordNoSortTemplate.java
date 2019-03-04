import java.io.*;
public  class WordNoSortTemplate extends WordsTemplate{
      WordNoSortTemplate(File file){
           super(file);
      }
      public  boolean isSort(){
           return false; 
      }
}
