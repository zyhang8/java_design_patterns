public class HouseDesign implements BuildingDesign{
      double width,length;
      int floorNumber;
      HouseDesign(double width,double length,int floorNumber){
            this.width=width;
            this.length=length;
            this.floorNumber=floorNumber;
      }
      public double computerArea(){
            return width*length*floorNumber;
      }
}