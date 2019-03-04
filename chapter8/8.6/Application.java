import java.util.*;
import java.io.*;
public class Application{
   public static void main(String args[]){
      BookNameList oldBookList=new BookNameList();
      oldBookList.setBookName();
      Enumeration bookenum=oldBookList.getEnumeration();
      IteratorAdapter adapter=new IteratorAdapter(bookenum);
      NewBookNameList newBookList=new NewBookNameList(adapter);
      newBookList.setBookName();
      System.out.println("导入到新系统中的图书列表:");
      newBookList.getBookName();
   }
}
