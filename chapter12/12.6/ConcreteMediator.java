public class ConcreteMediator implements Runnable{
    RedLight SNredLight;     // 南北方向的红灯
    GreenLight SNgreenLight;
    YellowLight SNyellowLight;
    RedLight EWredLight;     // 东西方向的红灯
    GreenLight EWgreenLight;
    YellowLight EWyellowLight;
    Thread thread;
    int timeOne=8,timeTwo=3,timeThree=10,timeFour=3;
    ConcreteMediator(){
        thread=new Thread(this);
    }
    public void startRun(){
        thread.start();
    }
    public void run(){
      while(true) {
        for(int i=1;i<=timeOne;i++){
            SNgreenLight.on();
            EWredLight.on();
            SNredLight.off();
            EWgreenLight.off(); 
            SNyellowLight.off();
            EWyellowLight.off();
            try{
                 Thread.sleep(500);
            }
            catch(InterruptedException exp){}
        }
        for(int i=1;i<=timeTwo;i++){
            SNyellowLight.on();
            EWredLight.on();
            SNgreenLight.off();
            EWgreenLight.off(); 
            SNredLight.off();
            EWyellowLight.off();
            try{
                 Thread.sleep(500);
            }
            catch(InterruptedException exp){}
        } 
        for(int i=1;i<=timeThree;i++){
            EWgreenLight.on();
            SNredLight.on(); 
            SNyellowLight.off();   
            EWredLight.off();
            SNgreenLight.off();
            EWyellowLight.off();
            try{
                 Thread.sleep(500);
            }
            catch(InterruptedException exp){}
        }
        for(int i=1;i<=timeFour;i++){
            EWyellowLight.on();
            SNredLight.on(); 
            EWgreenLight.off();  
            SNgreenLight.off();
            EWredLight.off();
            SNyellowLight.off();
            try{
                 Thread.sleep(500);
            }
            catch(InterruptedException exp){}
        }
      }
    }
    public void registerSNRedLight(RedLight redLight){
       SNredLight=redLight;
    }
    public void registerSNGreenLight(GreenLight greenLight){
       SNgreenLight=greenLight;
    }
    public void registerSNYellowLight(YellowLight yellowLight){
       SNyellowLight=yellowLight;
    }
    public void registerEWRedLight(RedLight redLight){
       EWredLight=redLight;
    }
    public void registerEWGreenLight(GreenLight greenLight){
       EWgreenLight=greenLight;
    }
    public void registerEWYellowLight(YellowLight yellowLight){
       EWyellowLight=yellowLight;
    }
}