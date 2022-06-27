package lession_09;

import java.util.List;

public class SalaryCalculator {
    public int getTotalSalary(List<Employee> employeeList){
       int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() + employee.supportMoney();
        }
       return totalSalary;
    }
}
