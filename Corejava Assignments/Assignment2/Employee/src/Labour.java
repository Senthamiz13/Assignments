public class Labour extends Employee {

    int overtime = 1000;

    public Labour(String name, String desig, int salary) {
        super(name, desig, salary);
    }
    @Override
    int totalsalary() {
        return (this.Salary+overtime);
    }
}
