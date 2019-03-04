public class HeightState implements TemperatureState{
       double n=26;
       HeightState(int n){
            if(n>26)
               this.n=n;
       }
       public void showTemperature(){
              System.out.println("现在温度是"+n+"属于高温度");
       }
}