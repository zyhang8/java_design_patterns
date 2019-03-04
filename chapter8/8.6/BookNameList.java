import java.util.*;
public class BookNameList{
    private Vector<String> vector;
    private Enumeration bookenum;
    BookNameList(){
        vector=new Vector<String>(); 
    }
    public void setBookName(){   //真实系统可能从一个数据库中得到图书名称
       vector.add("Java 程序设计");
       vector.add("J2ME 程序设计");
       vector.add("XML程序设计");
       vector.add("JSP 程序设计");
    }
    public Enumeration getEnumeration(){
       return vector.elements();
    }
}