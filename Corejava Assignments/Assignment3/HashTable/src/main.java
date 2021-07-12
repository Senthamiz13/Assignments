import java.util.*;

public class main {
    public static void main(String[] args) {

        Date DOB1 = new Date(3,4,98);//
        Date DOB2 = new Date(5,6,98);
        Date DOB3 = new Date(5,7,98);
        Date DOB4 = new Date(5,12,98);
        Date DOB5 = new Date(3,4,99);//

        empName Emp1 = new empName("Ram");
        empName Emp2 = new empName("Sasi");
        empName Emp3 = new empName("Theja");
        empName Emp4 = new empName("Shriram");
        empName Emp5 = new empName("Roshan");

        Map<Date,empName> mytable = new HashMap<Date, empName>();
        mytable.put(DOB1,Emp1);
        mytable.put(DOB2,Emp2);
        mytable.put(DOB3,Emp3);
        mytable.put(DOB4,Emp4);
        mytable.put(DOB5,Emp5);

        System.out.println(mytable);
    }
}
