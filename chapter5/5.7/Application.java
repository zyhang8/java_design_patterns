public class Application{
   public static void main(String args[]){
      WaterMessStation waterStation=new WaterMessStation();//具体主题               
      WaterDepartment 抗洪指挥部=new WaterDepartment(waterStation);//具体观察者
      waterStation.giveMess(10,209.9);
      waterStation.giveMess(11,219.8);
      waterStation.giveMess(7,127);
  }
}
