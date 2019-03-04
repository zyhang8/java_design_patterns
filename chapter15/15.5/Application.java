public class Application{
    public static void main(String args[]){
       Builder builder=new ChineseCalnederBuilder();
       Director director=new Director(builder,1945,3);
       director.constructProduct();
       builder=new AmericanCalnederBuilder();
       director=new Director(builder,1945,3);
       director.constructProduct();
    }
}
