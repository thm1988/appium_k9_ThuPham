package lession_09_01;

import lession_09_01.Employee;

import java.util.List;

public class SalaryCalculator {
    public int getTotalSalary(List<Employee> employeeList){
       int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() + employee.supportMoney();
        }
       return totalSalary;
    }

    public static void main(String[] args) {
        Employee employee = new FTE("Tan");
        System.out.println(employee.getName());
    }

}
