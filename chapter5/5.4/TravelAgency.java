import java.util.ArrayList;                      
public class TravelAgency implements Subject{
    String tourStartTime;
    String tourMess;
    ArrayList<Observer> personList;               
    TravelAgency(){
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
    public void giveMess(String time,String mess){
       tourStartTime=time;
       tourMess=mess;
       notifyObservers();
    }
    public String getTourStartTime(){
       return tourStartTime;
    }
    public String getTourMess(){
       return tourMess;
    }
}
