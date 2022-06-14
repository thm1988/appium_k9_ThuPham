package lab_07_01;

public class FullTimeEmployee extends Employee{
    private static final int FULLTIME_SALARY = 50000;

    @Override
    public int getSalary() {
        return FULLTIME_SALARY;
    }


}
