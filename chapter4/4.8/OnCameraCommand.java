public class OnCameraCommand implements Command{
    Camera camera;
    OnCameraCommand(Camera camera){
       this.camera=camera;
    }
    public  void execute(){
       camera.on();
    }
    public String getName(){
       return "´ò¿ªÉãÏñÍ·";
    } 
}
