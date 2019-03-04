public class Application{
   public static void main(String args[]){
      CompanyArmy 三连=new CompanyArmy();         //创建接收者
      Command command=new ConcreteCommand(三连);  //创建具体命令并指定接收者
      ArmySuperior 指挥官=new ArmySuperior();     //创建请求者
      指挥官.setCommand(command);                 
      指挥官.startExecuteCommand();
   }
}
