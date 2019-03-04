import java.util.ArrayList;                      
public class ShopSubject implements Subject{
    String goodsName;
    double oldPrice,newPrice;
    ArrayList<Observer> customerList;              
    ShopSubject(){
       customerList=new ArrayList<Observer>();
    }
    public void addObserver(Observer o){
       if(!(customerList.contains(o)))
         customerList.add(o);                     
    }
    public void deleteObserver(Observer o){
       if(customerList.contains(o))
         customerList.remove(o); 
    }
    public void notifyObservers(){ 
       for(int i=0;i<customerList.size();i++){
            Observer observer=customerList.get(i);
            observer.update();      //仅仅让观察者执行更新操作,但不提供数据        
       }
    }
    public void setDiscountGoods(String name,double oldP,double newP){ //设置打折商品
       goodsName=name;
       oldPrice=oldP;
       newPrice=newP;
       notifyObservers();          //通知所有的观察者
    }
    public String getGoodsName(){  //提供获得商品名字的方法
       return goodsName;
    }
    public double getOldPrice(){   //提供获得商品原价的方法
       return oldPrice;
    }
    public double getNewPrice(){  //提供获得商品折扣后的价格的方法
       return newPrice;
    }
}
