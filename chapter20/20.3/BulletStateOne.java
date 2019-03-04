public  class  BulletStateOne extends State{
       Gun gun;
       BulletStateOne(Gun gun){
            this.gun=gun; 
       }
       public  void fire(){
            System.out.print("射出最后一颗子弹");
            gun.setState(gun.getBulletStateNull());
            System.out.println("(进入"+gun.getBulletStateNull().showStateMess()+")") ;
      }   
      public  void loadBullet(){
            System.out.println("无法装弹");
      }  
      public String showStateMess(){
           return "1颗子弹状态";
      }
}  
