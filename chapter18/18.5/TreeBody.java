import java.util.*;
public class TreeBody implements TreeComponent{
      LinkedList<TreeComponent> list;
      double weight;
      String name;
      TreeBody(String name,double weight){
            this.name=name;
            this.weight=weight;
            list=new LinkedList<TreeComponent>();
      } 
      public void add(TreeComponent node) {
            list.add(node);
      }
      public void remove(TreeComponent node){
            list.remove(node);
      }
      public TreeComponent getChild(int index) {
            return list.get(index); 
      }
      public Iterator<TreeComponent>  getAllChildren() {
            return list.iterator(); 
      }
      public boolean isLeaf(){
           return false;
      } 
      public double getWeight(){
            return weight;
      }
      public String toString(){
            return name;
      }
}