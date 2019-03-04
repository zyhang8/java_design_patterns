import java.util.*;
public class Application{
    public static void main(String args[]){
        Collection<Integer> mylist=new LinkedList<Integer>();
        for(int i=1;i<10;i++){
           mylist.add(new Integer(i));
        }
        Iterator<Integer> iter=mylist.iterator();
        while(iter.hasNext()){
          System.out.println(iter.next());
        }
    }
}
