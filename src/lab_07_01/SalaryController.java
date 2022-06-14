package lab_07_01;

import java.util.List;

public class SalaryController {

    public static void main(String[] args) {
        SalaryController salaryController = new SalaryController();
    }
    public int totalEmployeeSalary(List<Employee> employeeList){
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}
