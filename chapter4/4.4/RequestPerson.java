public class RequestPerson{
   Command command;
   public void setCommand(Command command){
      this.command=command;
   }
   public void startExecuteCommand(){
      command.execute();
   }
}