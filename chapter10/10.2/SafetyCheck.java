public class SafetyCheck{
    String clientPacket;
    public SafetyCheck(String clientPacket){
       this.clientPacket=clientPacket;
    }
    public boolean isSave(){
       if(clientPacket.contains("ÆûÓÍ"))
          return false;
       else
          return true; 
    } 
}
