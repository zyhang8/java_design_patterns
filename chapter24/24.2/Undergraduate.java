public  class Undergraduate extends Student{
      double math,english;    //³É¼¨
      String name;
      Undergraduate(String name,double math,double english){
            this.name=name;
            this.math=math;
            this.english=english;
      } 
      public double getMath(){
            return math;
      } 
      public double getEnglish(){
            return english;
      } 
      public String getName(){
            return name;
      }
      public void accept(Visitor v){
           v.visit(this);
      }
}