import java.util.ArrayList;                      
public class WeatherStation implements Subject{
    String forecastTime,forecastMess;
    int maxTemperature,minTemperature;
    ArrayList<Observer> personList;               
    WeatherStation(){
       personList=new ArrayList<Observer>();
    }
    public void addObserver(Observer o){
       if(o==null)
          return; 
       if(!(personList.contains(o)))
         personList.add(o);                     
    }
    public void deleteObserver(Observer o){
       if(personList.contains(o))
         personList.remove(o); 
    }
    public void notifyObservers(){ 
       for(int i=0;i<personList.size();i++){
            Observer observer=personList.get(i);
            observer.update(this);         
       }
    }
    public void doForecast(String t,String mess,int max,int min){
       forecastTime=t;
       forecastMess=mess;
       maxTemperature=max;
       minTemperature=min;
       notifyObservers();
    }
    public String getForecastTime(){
       return forecastTime;
    }
    public String getForecastMess(){
       return forecastMess;
    }
    public int getMaxTemperature(){
       return maxTemperature;
    }
    public int getMinTemperature(){
       return minTemperature;
    }
}
