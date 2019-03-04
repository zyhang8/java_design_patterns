public  class  BulletStateTwo extends State{
       Gun gun;
       BulletStateTwo(Gun gun){
            this.gun=gun; 
       }
       public  void fire(){
            System.out.print("射出一颗子弹");
            gun.setState(gun.getBulletStateOne()); 
            System.out.println("(进入"+gun.getBulletStateOne().showStateMess()+")") ;
      }   
      public  void loadBullet(){
            System.out.println("无法装弹");
      }  
      public String showStateMess(){
           return "2颗子弹状态";
      }
}  
