public class ArmySuperior{
  Command command;                     //用来存放具体命令的引用
  public void setCommand(Command command){
     this.command=command;
  }
  public void startExecuteCommand(){   //让具体命令执行execute()方法
     command.execute();
  }
}
