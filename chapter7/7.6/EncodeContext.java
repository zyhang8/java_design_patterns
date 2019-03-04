import java.io.File;
public class EncodeContext{
     EncryptStrategy strategy;
     public void setStrategy(EncryptStrategy strategy){
         this.strategy=strategy;
     } 
     public void encryptFile(File file){
        strategy.encryptFile(file);
     }
     public String decryptFile(File file){
        return strategy.decryptFile(file);
     }
}
