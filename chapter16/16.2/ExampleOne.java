class Circle implements Cloneable{   //实现Cloneable接口
     private double radius;
     public void setRadius(double r){
           radius=r;
    }
    public double getRadius(){
          return radius;
    }
    public Object clone() throws CloneNotSupportedException{ //重写clone方法
          Object  object=super.clone();
          return object;
    }
}
public class ExampleOne{
    public static void main(String args[]){
         Circle circle=new Circle();
         circle.setRadius(198.99);
         try{
              Circle circleCopy=(Circle)circle.clone();//调用clone()复制自己
              System.out.println("circle对象中的数据："+circle.getRadius());
              System.out.println("circleCopy对象中的数据："+circle.getRadius()); 
           }
          catch(CloneNotSupportedException exp){} 
    } 
}
