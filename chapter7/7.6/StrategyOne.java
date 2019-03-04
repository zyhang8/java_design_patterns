import java.io.*;
public class StrategyOne implements EncryptStrategy{
    String password;
    StrategyOne(){
      this.password="I loev This Game";
    }
    StrategyOne(String password){
      if(password.length()==0) 
         this.password="I loev This Game";  
      this.password=password;
    }
    public void encryptFile(File file){
      try{ 
           byte [] a=password.getBytes();
           FileInputStream in=new FileInputStream(file);
           long length=file.length();
           byte [] c=new byte[(int)length];
           int m=in.read(c);
           for(int k=0;k<m;k++){
               int n=c[k]+a[k%a.length];       //加密运算
               c[k]=(byte)n; 
           }
           in.close();
           FileOutputStream out=new FileOutputStream(file);
           out.write(c,0,m);
           out.close();
      }
      catch(IOException exp){}
    }
    public String decryptFile(File file){
      try{ 
           byte [] a=password.getBytes();
           long length=file.length();
           FileInputStream in=new FileInputStream(file);
           byte [] c=new byte[(int)length];
           int m=in.read(c);
           for(int k=0;k<m;k++){
              int n=c[k]-a[k%a.length];
              c[k]=(byte)n;                   //解密运算
           }
           in.close();
           return new String(c,0,m);
      }
      catch(IOException exp){
           return exp.toString();
      }
   }
}
