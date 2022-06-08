package lab_07;

public class ContractorEmployee extends Employee{
    private int salary = 40000;

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
