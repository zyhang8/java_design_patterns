import java.io.*;
public class CustomerTwo implements Observer{
   Subject subject;
   double oldPrice,newPrice;
   String personName;  
   CustomerTwo(Subject subject,String personName){
      this.subject=subject;
      this.personName=personName;
      subject.addObserver(this);  
   }
   public void update(){
      if(subject instanceof ShopSubject){
        oldPrice=((ShopSubject)subject).getOldPrice();//调用具体主题提供的getOldPrice()方法
        newPrice=((ShopSubject)subject).getNewPrice();//调用具体主题提供的getNewPrice()方法
        System.out.println(personName+"只对商品的原价和折扣后的价格感兴趣:");
        System.out.println("原价是:"+oldPrice);
        System.out.println("现价是:"+newPrice);
      }
   } 
}