import javax.swing.*;
public class ConcreteBuilderTwo implements Builder{
      private PanelProduct panel;       //需要创建的容器
      ConcreteBuilderTwo(){
            panel=new PanelProduct();
      } 
      public void buildButton(){
            panel.button=new JButton("button");
      }
      public void buildLabel(){
           panel.label=new JLabel("label");
      }
      public void buildTextField(){
           panel.textField=new JTextField("textField");
      }
      public JPanel  getPanel(){
            panel.add(panel.textField);//与ConcreteBuilderOne添加组件的顺序的不同
            panel.add(panel.label);
            panel.add(panel.button);
            return panel;
      }
}
