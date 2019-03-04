public class Cubic implements Prototype, Cloneable{
      double  length,width,height;
      Cubic(double a,double b,double c){
            length=a;
            width=b;
            height=c;
      }
      public Object cloneMe() throws CloneNotSupportedException{
            Cubic object=(Cubic)clone();  //调用从Object类继承的clone()方法
            return object;
      } 
}
