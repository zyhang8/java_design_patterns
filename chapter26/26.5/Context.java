import java.util.StringTokenizer;
public class Context{
      StringTokenizer tokenizer;
      String token;
      public Context(String text){
           setContext(text);
     } 
     public void setContext(String text){
          tokenizer=new StringTokenizer(text);
     }
      String nextToken(){
            if(tokenizer.hasMoreTokens()){
                 token=tokenizer.nextToken(); 
           }
           else
                token="";
           return token;
      } 
}