public class Person implements Observer{
   Subject subjectOne,subjectTwo;         //可依赖的主题
   String forecastTime,forecastMess;
   String tourStartTime,tourMess;
   int maxTemperature,minTemperature;
   Person(Subject subjectOne,Subject subjectTwo){
      this.subjectOne=subjectOne;
      this.subjectTwo=subjectTwo;
      subjectOne.addObserver(this); 
      subjectTwo.addObserver(this); 
   }
   public void update(Subject subject){
      if(subject instanceof WeatherStation){
        WeatherStation WS=(WeatherStation)subject;
        forecastTime=WS.getForecastTime();
        forecastMess=WS.getForecastMess();
        maxTemperature=WS.getMaxTemperature();
        minTemperature=WS.getMinTemperature();
        System.out.print("预报日期:"+forecastTime+"，");
        System.out.print("天气状况:"+forecastMess+"，");
        System.out.print("最高温度:"+maxTemperature+"，");
        System.out.println("最低温度:"+minTemperature+"。");
      }
      else if(subject instanceof TravelAgency){
        TravelAgency TA=(TravelAgency)subject;
        tourStartTime=TA.getTourStartTime();
        tourMess=TA.getTourMess();
        System.out.print("旅游开始日期:"+tourStartTime+"，");
        System.out.println("旅游信息:"+tourMess+"。");
     }
   } 
}
