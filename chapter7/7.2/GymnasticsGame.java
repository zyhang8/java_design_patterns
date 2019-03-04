public class  GymnasticsGame{
     ComputableStrategy strategy;
     public void setStrategy(ComputableStrategy strategy){
         this.strategy=strategy;
     } 
     public double getPersonScore(double [] a){
        if(strategy!=null)
          return strategy.computeScore(a); 
        else
          return 0;
     }
}