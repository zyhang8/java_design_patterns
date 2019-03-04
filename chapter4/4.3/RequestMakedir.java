public class RequestMakedir{
   Command command;
   public void setCommand(Command command){
      this.command=command;
   }
   public void startExecuteCommand(String name){
      command.execute(name);
   }
   public void undoCommand(){
      command.undo();
   }
}
