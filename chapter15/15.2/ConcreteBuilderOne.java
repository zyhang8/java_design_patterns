import javax.swing.*;
public class ConcreteBuilderOne implements Builder{
      private PanelProduct panel;
      ConcreteBuilderOne(){
            panel=new PanelProduct();
      } 
      public void buildButton(){
            panel.button=new JButton("按钮");
      }
      public void buildLabel(){
           panel.label=new JLabel("标签");
      }
      public void buildTextField(){
           panel.textField=new JTextField("文本框");
      }
      public JPanel  getPanel(){
           panel.add(panel.button);
           panel.add(panel.label);
           panel.add(panel.textField);
           return panel;
      }
} 
