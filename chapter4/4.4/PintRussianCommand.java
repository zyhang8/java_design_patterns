public class PintRussianCommand implements Command{
    PrintLetter letter;
    PintRussianCommand(PrintLetter letter){
       this.letter=letter;
    }
    public  void execute(){
       letter.printRussian();
    }
}
