import javax.swing.*;
public  class  HaveNotCaffee extends State{
      AutoCoffeeMachine  machine;
      HaveNotCaffee(AutoCoffeeMachine  machine){
             this.machine=machine;
      }
      public  void  giveAnCupCaffee(){
            machine.messShowing.setIcon(new ImageIcon("no.jpg"));
            machine.putInCoin.setEnabled(false);
            machine.getCaffee.setEnabled(false);
            showMessage();
     }   
     public  void showMessage(){
           machine.messShowing.setText("目前机器中没有咖啡");
    }  
}  


