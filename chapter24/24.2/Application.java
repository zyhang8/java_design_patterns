import java.util.*;
public class Application{
     public static void main(String args[]) {
           Visitor visitor=new Company();
           ArrayList<Student>  studentList=new  ArrayList<Student>();
           Student student=null;
           studentList.add(student=new Undergraduate("张三",67,88));
           studentList.add(student=new Undergraduate("李四",90,98));
           studentList.add(student=new Undergraduate("将粼粼",85,92));
           studentList.add(student=new GraduateStudent("刘名",88,70,87));
           studentList.add(student=new GraduateStudent("郝人",90,95,82));
           Iterator<Student> iter=studentList.iterator();
           while(iter.hasNext()){
                Student stu=iter.next();
                stu.accept(visitor);  
           }
     }
} 
