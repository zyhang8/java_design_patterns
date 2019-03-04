import java.util.Observable;       
import java.util.Observer;
import java.util.TreeSet;
import java.util.Iterator;
import javax.swing.*;         
public class ShowWord extends JPanel implements Observer {
   Observable subject;
   JTextArea text;
   TreeSet<String> wordList;
   ShowWord(Observable subject){
      this.subject=subject;
      subject.addObserver(this);
      text=new JTextArea(10,15);
      text.setLineWrap(true);
      text.setWrapStyleWord(true);
      text.setEditable(false); 
      add(new JScrollPane(text));
      wordList=new TreeSet<String>(); 
   }
   public void update(Observable subject,Object object){
      text.setText(null);
      text.append("出现的单词有(按字典序排序)：\n");
      wordList.clear(); 
      String content=object.toString();
      //空格字符、数字和符号(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式:
       String regex="[\\s\\d\\p{Punct}]+"; 
       String words[]=content.split(regex); 
       for(int i=0;i<words.length;i++){
           wordList.add(words[i]);  
       }
       Iterator<String> te=wordList.iterator();
       while(te.hasNext()){
          String str=te.next();
          text.append(str+" ");
       }   
   } 
}
