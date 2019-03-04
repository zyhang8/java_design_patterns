import java.util.*;
public interface MilitaryPerson{
      public void add(MilitaryPerson person) throws  NoSuchMethodException;
      public void remove(MilitaryPerson person) throws  NoSuchMethodException;
      public MilitaryPerson getChild(int index) throws  NoSuchMethodException;
      public Iterator<MilitaryPerson>  getAllChildren() throws  NoSuchMethodException;
      public boolean isLeaf();
      public double getSalary();
      public void setSalary(double salary);
      public String toString();
}