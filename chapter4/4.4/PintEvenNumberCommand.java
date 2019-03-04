public class PintEvenNumberCommand implements Command{
    PrintNumber number;
    PintEvenNumberCommand(PrintNumber number){
       this.number=number;
    }
    public  void execute(){
       number.printEvenNumber();
    }
}
