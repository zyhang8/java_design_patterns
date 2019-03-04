public class Application{
   public static void main(String args[]){
     GymnasticsGame game=new GymnasticsGame();  //上下文对象
     game.setStrategy(new StrategyOne());       //上下文对象使用策略一
     Person zhang=new Person();
     zhang.setName("张三");
     double [] a={9.12,9.25,8.87,9.99,6.99,7.88};
     Person li=new Person();
     li.setName("李四");
     double [] b={9.15,9.26,8.97,9.89,6.97,7.89};   
     zhang.setScore(game.getPersonScore(a));
     li.setScore(game.getPersonScore(b));
     System.out.println("使用算术平均值方案:");
     System.out.printf("%s最后得分:%5.3f%n",zhang.getName(),zhang.getScore());
     System.out.printf("%s最后得分:%5.3f%n",li.getName(),li.getScore());
     game.setStrategy(new StrategyTwo());   //上下文对象使用策略二
     zhang.setScore(game.getPersonScore(a));
     li.setScore(game.getPersonScore(b));
     System.out.println("使用几何平均值方案:");
     System.out.printf("%s最后得分:%5.3f%n",zhang.getName(),zhang.getScore());
     System.out.printf("%s最后得分:%5.3f%n",li.getName(),li.getScore());  
     game.setStrategy(new StrategyThree());   //上下文对象使用策略三
     zhang.setScore(game.getPersonScore(a));
     li.setScore(game.getPersonScore(b));
     System.out.println("使用（去掉最高、最底）算术平均值方案:");
     System.out.printf("%s最后得分:%5.3f%n",zhang.getName(),zhang.getScore());
     System.out.printf("%s最后得分:%5.3f%n",li.getName(),li.getScore());            
  }
}
class Person{
   String name;
   double score;
   public void setScore(double t){
      score=t;
   }
   public void setName(String s){
      name=s;
   }
   public double getScore(){
      return score;
   }
   public String getName(){
      return name;
   }
}
