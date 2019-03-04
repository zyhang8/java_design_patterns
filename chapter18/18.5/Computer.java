import java.util.*;
public class Computer{
     public static double computerWeight(TreeComponent node){
           double weightSum=0;
           if(node.isLeaf()==true){
                weightSum=weightSum+node.getWeight();
           }
           if(node.isLeaf()==false){
                weightSum=weightSum+node.getWeight();
                Iterator<TreeComponent> iterator=node.getAllChildren();
                while(iterator.hasNext()){
                             TreeComponent p= iterator.next();
                             weightSum=weightSum+computerWeight(p);;
                }
           }
           return weightSum;
    }
    public static double computerValue(TreeComponent node,double unit){
           double appleWorth=0;
           if(node.isLeaf()==true){
                appleWorth=appleWorth+node.getWeight()*unit;
           }
           if(node.isLeaf()==false){
                Iterator<TreeComponent> iterator=node.getAllChildren();
                while(iterator.hasNext()){
                             TreeComponent p= iterator.next();
                             appleWorth=appleWorth+computerValue(p,unit);
                }
           }
           return appleWorth;
    }
    public static String getAllChildrenName(TreeComponent node){
           StringBuffer mess= new StringBuffer(); 
            if(node.isLeaf()==true){
               mess.append(" "+node.toString());
            }
            if(node.isLeaf()==false){
                  mess.append(" "+node.toString());
                 Iterator<TreeComponent> iterator=node.getAllChildren();
                  while(iterator.hasNext()){
                      TreeComponent p= iterator.next();
                       mess.append(getAllChildrenName(p));
                 }
           }
           return new String(mess);
    }
}