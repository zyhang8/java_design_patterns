import java.util.*;
public class Application{
    public static void main(String args[]){
       int n=20;
       int sum=0;  
       Collection<RenMinMony> set=new HashSet<RenMinMony>();  //集合对象
       for(int i=1;i<=n;i++){
          if(i==n/2||i==n/5||i==n/6)
            set.add(new RenMinMony(100,false));
          else
            set.add(new RenMinMony(100,true)); 
       }
       Iterator<RenMinMony> iterator=set.iterator();       //迭代器
       int jia=1,zhen=1;
       System.out.println("保险箱共有"+set.size()+"张人民币");
       int k=0; 
       while(iterator.hasNext()){
           RenMinMony money=iterator.next();
           k++; 
           if(money.getIsTrue()==false){
              System.out.println("第"+k+"张是假币,被销毁");
              iterator.remove();
              k++;
           }
       }
       System.out.println("保险箱现有真人民币"+set.size()+"张,总价值是:");  
       iterator=set.iterator();
       while(iterator.hasNext()){
           RenMinMony money=iterator.next();
           sum=sum+money.getValue();
       }
       System.out.println(sum+"元");
   }
}
class RenMinMony{
   int value;
   private boolean isTrue;
   RenMinMony(int value,boolean b){
      this.value=value;
       isTrue=b;
   } 
   public boolean getIsTrue(){
      return isTrue;
   }
   public int getValue(){
      return value;
   }
}

