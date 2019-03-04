import java.util.ArrayList;
public class Application{
   public static void main(String args[]){
    ArrayList<Command> list=new ArrayList<Command>();
    RequestPerson person=new RequestPerson();                  //创建请求者者
    Command command1=new PintEnglishCommand(new PrintLetter());//创建具体命令指定接收者
    Command command2=new PintRussianCommand(new PrintLetter());
    Command command3=new PintEvenNumberCommand(new PrintNumber(20)); 
    list.add(command1);
    list.add(command2);
    list.add(command3); 
    Command macroCommand=new MacroCommand(list);               //创建宏命令 
    System.out.println("单独输出英文字母表:");
    person.setCommand(command1);
    person.startExecuteCommand();         
    System.out.printf("%n用一个宏命令输出英文字母表,俄文字母表和1-20之间的偶数:%n");
    person.setCommand(macroCommand);
    person.startExecuteCommand();
  }
}
