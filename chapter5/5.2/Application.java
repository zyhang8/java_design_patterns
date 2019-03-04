public class Application{
   public static void main(String args[]){
      SeekJobCenter center=new SeekJobCenter();                
      UniverStudent zhangLin=new UniverStudent(center,"A.txt");
      HaiGui wangHao=new HaiGui(center,"B.txt");               
      center.giveNewMess("腾辉公司需要10个java程序员。");    
      center.notifyObservers();                                
      center.giveNewMess("海景公司需要8个动画设计师。");
      center.notifyObservers();
      center.giveNewMess("仁海公司需要9个电工。");
      center.notifyObservers();
      center.giveNewMess("仁海公司需要9个电工。");      
      center.notifyObservers();                          
  }
}
