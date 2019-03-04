public class  SparrowDecoratorTwo extends Decorator{
   public final int DISTANCE=20;
   SparrowDecoratorTwo(Bird bird){
      super(bird);
   }
   public int fly(){
      int distance=0;
      distance=bird.fly()+eleFly();
      return distance; 
   }
   public int eleFly(){
      return DISTANCE;
   }
}