import java.util.*;

public class main {
    public static void main(String[] args) {


        empName Emp1 = new empName("Ram");
        empName Emp2 = new empName("Sasi");
        empName Emp3 = new empName("Theja");
        empName Emp4 = new empName("Shriram");
        empName Emp5 = new empName("Roshan");

        Hashtable<empName,empName> mytable = new Hashtable<empName,empName>();
        mytable.put(Emp1,Emp1);
        mytable.put(Emp2,Emp1);
        mytable.put(Emp3,Emp1);
        mytable.put(Emp4,Emp1);
        mytable.put(Emp5,Emp1);

        System.out.println(mytable);
    }
}
