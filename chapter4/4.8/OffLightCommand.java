public class OffLightCommand implements Command{
    Light light;
    OffLightCommand(Light light){
       this.light=light;
    }
    public  void execute(){
       light.off();
    }
    public String getName(){
       return "πÿ±’’’√˜µ∆";
    } 
}
