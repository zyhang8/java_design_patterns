public class PintEnglishCommand implements Command{
    PrintLetter letter;
    PintEnglishCommand(PrintLetter letter){
       this.letter=letter;
    }
    public  void execute(){
       letter.printEnglish();
    }
}
