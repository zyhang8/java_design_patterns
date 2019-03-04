import javax.swing.*;
public interface Builder{
    public abstract void buildButton();
    public abstract void buildLabel();
    public abstract void buildTextField();
    public abstract JPanel getPanel();
}
