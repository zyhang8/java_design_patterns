import java.util.Observable;       //引入Observablel类
import java.util.Observer;         //引入Observer接口
public class WaterDepartment implements Observer{
   Observable subject;
   double  waterVelocity;         //水流速度
   double  waterDischarge;        //水流量
   WaterDepartment(Observable subject){
      this.subject=subject;
      subject.addObserver(this); 
   }
   public void update(Observable subject,Object object){
      if(subject instanceof WaterMessStation){
        WaterMessStation WMS=(WaterMessStation)subject;
        waterVelocity=WMS.getWaterVelocity();
        waterDischarge=WMS.getWaterDischarge();
        System.out.print("水的流速（米/秒）:"+waterVelocity+"，");
        System.out.println("流量（立方米/秒）:"+waterDischarge);
      }
   } 
}
