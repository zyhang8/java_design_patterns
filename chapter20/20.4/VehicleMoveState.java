public  class  VehicleMoveState extends State{
      public  void startUp(Vehicle vehicle){
             System.out.println(vehicle.getName()+"已经在运动状态了");
      }   
       public  void stop(Vehicle vehicle){
            System.out.println(vehicle.getName()+"停止运动");
            vehicle.setState(vehicle.getRestState()); 
      }  
}  
