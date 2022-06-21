package lab_07_01;

public class Employee {
    private String name;
    private int salary;

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return 0;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
