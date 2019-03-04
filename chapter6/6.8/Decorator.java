public abstract class Decorator extends ReadWord{
    protected ReadWord reader;
    public Decorator(){
    }
    public Decorator(ReadWord reader){
       this.reader=reader; 
    }
}
