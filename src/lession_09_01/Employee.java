package lession_09_01;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSalary();
    public abstract int supportMoney();

}
