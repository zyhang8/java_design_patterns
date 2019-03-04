public class Application{
   public static void main(String args[]){
      MakeDir makeDir=new MakeDir();                
      Command command=new ConcreteCommand(makeDir); 
      RequestMakedir askMakedir=new RequestMakedir();
      askMakedir.setCommand(command); 
      askMakedir.startExecuteCommand("jiafei");      
      askMakedir.startExecuteCommand("jerry");     
      askMakedir.startExecuteCommand("tom");       
      askMakedir.undoCommand();                 
      askMakedir.undoCommand();                   
  }
}
