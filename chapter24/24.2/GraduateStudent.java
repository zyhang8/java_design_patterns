public  class GraduateStudent extends Student{
      double math,english,physics;    //³É¼¨
      String name;
      GraduateStudent(String name,double math,double english,double physics){
            this.name=name;
            this.math=math;
            this.english=english;
            this.physics=physics;
      }
      public double getMath(){
            return math;
      } 
      public double getEnglish(){
            return english;
      } 
      public double getPhysics(){
            return physics;
      } 
      public String getName(){
            return name;
      }
      public void accept(Visitor v){
           v.visit(this);
      }
}