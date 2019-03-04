import java.io.*;
public class CustomerOne implements Observer{
   Subject subject;
   String goodsName,personName;  
   CustomerOne(Subject subject,String personName){
      this.subject=subject;
      this.personName=personName;
      subject.addObserver(this);  
   }
   public void update(){
      if(subject instanceof ShopSubject){
         goodsName=((ShopSubject)subject).getGoodsName();//调用具体主题提供的方法
         System.out.println(personName+"只对打折商品的名字感兴趣:");
         System.out.println("打折的商品是:"+goodsName);
      }
   } 
}