import java.util.*;
public class IteratorAdapter implements Iterator{
    Enumeration bookenum;
    IteratorAdapter(Enumeration bookenum){
        this.bookenum=bookenum;
    }
    public boolean hasNext(){
        return bookenum.hasMoreElements();
    }
    public Object next(){
        return bookenum.nextElement();
    }
    public void remove(){
        System.out.println("枚举器没有删除集合元素的方法");
    }
}