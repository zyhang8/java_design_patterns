public class Application{
    public static void main(String args[]){
       ConcreteMediator mediator=new ConcreteMediator();
       ColleagueA colleagueA=new ColleagueA(mediator);
       ColleagueB colleagueB=new ColleagueB(mediator);
       ColleagueC colleagueC=new ColleagueC(mediator);
       colleagueA.setName("A国");
       colleagueB.setName("B国");
       colleagueC.setName("C国");
       String [] messA={"要求归还曾抢夺的100斤土豆","要求归还曾抢夺的20头牛"};  
       colleagueA.giveMess(messA);
       String [] messB={"要求归还曾抢夺的10只公鸡","要求归还曾抢夺的15匹马"};
       colleagueB.giveMess(messB);
       String [] messC={"要求归还曾抢夺的300斤小麦","要求归还曾抢夺的50头驴"};
       colleagueC.giveMess(messC);
    }
}
