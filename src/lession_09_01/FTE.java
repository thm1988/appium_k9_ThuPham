package lession_09_01;

public class FTE extends Employee{

    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int supportMoney() {
        return 0;
    }

}
