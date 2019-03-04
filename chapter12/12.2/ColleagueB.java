public class ColleagueB implements Colleague{
    ConcreteMediator mediator;                //中介者
    String name;
    ColleagueB(ConcreteMediator mediator){
       this.mediator=mediator;
       mediator.registerColleagueB(this);
    }
    public void setName(String name){
       this.name=name;
    }
    public String getName(){
        return name;
    } 
   public void giveMess(String [] mess){
        mediator.deliverMess(this,mess);
    }
    public void receiverMess(String mess){
       System.out.println(name+"收到的信息:");
       System.out.println("\t"+mess);
    }
}