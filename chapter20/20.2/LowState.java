public class LowState implements TemperatureState{
       double n=0;
       LowState(double n){
            if(n<=0)
              this.n=n;
       }
       public void showTemperature(){
              System.out.println("现在温度是"+n+"属于低温度");
       }
}