public class MiddleState implements TemperatureState{
       double n=10;
       MiddleState(int n){
            if(n>0&&n<=26)
               this.n=n;
       }
       public void showTemperature(){
              System.out.println("现在温度是"+n+"属于正常温度");
       }
}