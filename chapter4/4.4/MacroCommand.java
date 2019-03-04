import java.util.ArrayList;
public  class MacroCommand implements Command{
    ArrayList<Command> commandList;
    MacroCommand(ArrayList<Command> commandList){
       this.commandList=commandList;
    }
    public  void execute(){
       for(int k=0;k<commandList.size();k++){
           Command command=commandList.get(k);
           command.execute();
       }
    }
}
