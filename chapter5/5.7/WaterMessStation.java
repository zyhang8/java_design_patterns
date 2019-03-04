import java.util.Observable;       //引入Observablel类
import java.util.Observer;         //引入Observer接口
public class WaterMessStation extends Observable{
    double  waterVelocity;         //水流速度
    double  waterDischarge;        //水流量
    public void giveMess(double waterVelocity,double waterDischarge){
       if(this.waterVelocity!=waterVelocity||this.waterDischarge!=waterDischarge)
          setChanged();
       this.waterVelocity=waterVelocity;
       this.waterDischarge=waterDischarge;
       notifyObservers();
    }
    public double getWaterVelocity(){
       return waterVelocity;
    }
    public double getWaterDischarge(){
       return waterDischarge;
    }
}
