public class Manager extends Employee{
    int incentives = 5000;

    public Manager(String name, String desig, int salary) {
        super(name, desig, salary);
    }
    @Override
    int totalsalary() {
        return (this.Salary+incentives);
    }
}
