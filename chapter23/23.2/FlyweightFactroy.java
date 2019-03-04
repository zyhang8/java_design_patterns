import java.util.HashMap;
public class FlyweightFactroy{
       private   HashMap<String,Flyweight>  hashMap;
       static  FlyweightFactroy factroy=new FlyweightFactroy();
       private FlyweightFactroy(){
             hashMap=new HashMap<String,Flyweight>();
       }
       public static FlyweightFactroy getFactroy(){
             return factroy;
       }
       public synchronized Flyweight getFlyweight(String key){
            if(hashMap.containsKey(key))
                       return hashMap.get(key);
            else{ 
                      double width=0,height=0,length=0;
                      String [] str=key.split("#");
                      width=Double.parseDouble(str[0]);
                      height=Double.parseDouble(str[1]);
                      length=Double.parseDouble(str[2]);
                      Flyweight ft=new ConcreteFlyweight(width,height,length);
                      hashMap.put(key,ft);
                      return ft;
            } 
       }
       class ConcreteFlyweight implements Flyweight{
             private double width;
             private double height;
             private double length; 
             private ConcreteFlyweight(double width,double height,double length){
                   this.width=width;
                   this.height=height;
                   this.length=length;
            }
            public double getHeight(){
                   return height;
            }
            public double getWidth(){
                   return width;
            }
            public double getLength(){
                   return length;
           }
           public void printMess(String mess){
                 System.out.print(mess);        //输出外部数据mess
                 System.out.print(" 宽度："+width);  //输出内部数据width
                 System.out.print(" 高度："+height);
                 System.out.println("长度："+length);
           }
      }
}
