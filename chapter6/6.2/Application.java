public class Application{
   public void needBird(Bird bird){
       int flyDistance=bird.fly();
       System.out.println("这只鸟能飞行"+flyDistance+"米");  
   }
   public static void main(String args[]){
      Application client=new Application();    
      Sparrow sparrow=new Sparrow();            
      SparrowDecorator sparrowDecorator1=
      new SparrowDecorator(sparrow);            
      SparrowDecorator sparrowDecorator2=
      new SparrowDecorator(sparrowDecorator1);  
      client.needBird(sparrowDecorator1); 
      client.needBird(sparrowDecorator2);                
  }
}
 
  
