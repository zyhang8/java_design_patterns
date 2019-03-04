import java.io.*;
public class Application{
   public static void main(String args[]){
     File fileOne=new File("A.txt");
     File fileTwo=new File("B.txt");
     String s="";
     EncodeContext encode=new EncodeContext();         //上下文对象
     encode.setStrategy(new StrategyOne("你好hello")); //上下文对象使用策略一
     encode.encryptFile(fileOne);
     System.out.println(fileOne.getName()+"加密后的内容:");
     try{  FileReader inOne=new FileReader(fileOne);
           BufferedReader inTwo= new BufferedReader(inOne);
           while((s=inTwo.readLine())!=null){
             System.out.println(s);
           } 
           inOne.close();
           inTwo.close();
     }
     catch(IOException exp){} 
     String str=encode.decryptFile(fileOne); 
     System.out.println(fileOne.getName()+"解密后的内容:");
     System.out.println(str);
     encode.setStrategy(new StrategyTwo("篮球game"));  //上下文对象使用策略二
     encode.encryptFile(fileTwo);
     System.out.println("\n"+fileTwo.getName()+"加密后的内容:");
     try{  FileReader inOne=new FileReader(fileTwo);
           BufferedReader inTwo= new BufferedReader(inOne);
           while((s=inTwo.readLine())!=null){
             System.out.println(s);
           } 
           inOne.close();
           inTwo.close();
     }
     catch(IOException exp){}
     str=encode.decryptFile(fileTwo); 
     System.out.println(fileTwo.getName()+"解密后的内容:");
     System.out.println(str); 
  }
}
