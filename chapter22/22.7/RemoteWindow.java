import java.rmi.*;
import javax.swing.*;
public interface RemoteWindow extends Remote {
      public JFrame getWindow() throws RemoteException;
}
