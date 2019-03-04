import java.util.*;
public class ComputerSalary{
     public static double computerSalary(MilitaryPerson person){
           double sum=0;
           if(person.isLeaf()==true){
                sum=sum+person.getSalary();
           }
           if(person.isLeaf()==false){
                sum=sum+person.getSalary();
                Iterator<MilitaryPerson> iterator=person.getAllChildren();
                while(iterator.hasNext()){
                             MilitaryPerson p= iterator.next();
                             sum=sum+computerSalary(p);;
                }
           }
           return sum;
    }
}