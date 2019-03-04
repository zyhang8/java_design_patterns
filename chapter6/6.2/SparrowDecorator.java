public class  SparrowDecorator extends Decorator{
   public final int DISTANCE=50;        //eleFly方法能飞50米
   SparrowDecorator(Bird bird){
      super(bird);
   }
   public int fly(){
      int distance=0;
      distance=bird.fly()+eleFly();  //委托被装饰者bird调用fly()，然后再调用eleFly()
      return distance; 
   }
   private int eleFly(){              //装饰者新添加的方法
      return DISTANCE;
   }
}
