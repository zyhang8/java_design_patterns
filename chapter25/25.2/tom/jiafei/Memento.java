package tom.jiafei;
public class  Memento implements java.io.Serializable{
      private long state;
       void setPositionState(long state){
              this.state=state;
       } 
       long getPositionState(){
               return state;
       } 
}
