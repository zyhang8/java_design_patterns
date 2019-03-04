public class Application{
   public static void main(String args[]){
      WeatherStation weatherStation=new WeatherStation();//具体主题               
      TravelAgency travelAgency=new TravelAgency();      //具体主题
      Person 李先生=new Person(weatherStation,travelAgency);
      weatherStation.doForecast("10日","阴有小雨",28,20);
      travelAgency.giveMess("10日","黄山2日游");
      weatherStation.doForecast("11日","阴转多云",30,22);
      travelAgency.giveMess("11日","漓江1日游");
  }
}
