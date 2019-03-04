import java.util.*;
public class Apple implements TreeComponent{
      LinkedList<TreeComponent> list;
      double weight;
      String name;
      Apple(String name,double weight){
            this.name=name;
            this.weight=weight;
            list=new LinkedList<TreeComponent>();
      } 
      public void add(TreeComponent node) {}
      public void remove(TreeComponent node){}
      public TreeComponent getChild(int index) {
            return null; 
      }
      public Iterator<TreeComponent>  getAllChildren() {
            return null; 
      }
      public boolean isLeaf(){
           return true;
      } 
      public double getWeight(){
            return weight;
      }
      public String toString(){
            return name;
      }
}