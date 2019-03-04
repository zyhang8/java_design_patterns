public class Application{
   public static void main(String args[]){
      ShopSubject shop=new ShopSubject();                
      CustomerOne boy=new CustomerOne(shop,"张大三"); 
      CustomerTwo girl=new CustomerTwo(shop,"李红花");
      shop.setDiscountGoods("Photo数码相机",2345.9,2008.8);
      shop.setDiscountGoods("HKO手机",1236,998);
  }
}