import java.io.*;
public interface EncryptStrategy{
    public abstract void encryptFile(File file);
    public abstract String decryptFile(File file);
}