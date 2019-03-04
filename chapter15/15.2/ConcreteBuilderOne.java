import javax.swing.*;
public class ConcreteBuilderOne implements Builder{
      private PanelProduct panel;       //需要创建的容器
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
           panel.add(panel.button); //与ConcreteBuilderTwo添加组件的顺序的不同
           panel.add(panel.label);
           panel.add(panel.textField);
           return panel;
      }
} 
