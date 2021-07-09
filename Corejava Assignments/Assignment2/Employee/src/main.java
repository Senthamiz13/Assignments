public class main {
    public static void main(String[] args) {
        Manager obj = new Manager("Rahul","Manager",50000);
        Labour obj2 = new Labour("Ram","labour",20000);

        System.out.println("Total Salary of Rahul is "+obj.totalsalary());
        System.out.println("Total Salary of Ram is "+obj2.totalsalary());

    }
}
