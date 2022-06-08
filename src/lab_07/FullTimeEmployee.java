package lab_07;

public class FullTimeEmployee extends Employee{
    private int salary = 50000;

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
