public class Application{
    public static void main(String args[]){
        UseSet useSet=new UseSet();
        useSet.addStudent(new Student("001","张三",76.89));
        useSet.addStudent(new Student("002","李四",88.89));
        useSet.addStudent(new Student("003","刘五",58.12));
        useSet.addStudent(new Student("004","赵六",66.55));
        useSet.addStudent(new Student("005","周七",92.57));
        String n="003";
        System.out.println("查找学号为"+n+"的学生:");
        useSet.lookStudent(n);
        System.out.println("将学生按成绩排列:");
        useSet.printStudentsByScore();
    }
}