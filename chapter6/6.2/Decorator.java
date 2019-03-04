public abstract class  Decorator extends Bird{
    protected Bird bird;
    public Decorator(){
    }
    public Decorator(Bird bird){
       this.bird=bird; 
    }
}