package lab_07_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryController {

    public static void main(String[] args) {
        SalaryController salaryController = new SalaryController();
        Employee tan = new FullTimeEmployee();
        Employee nga = new FullTimeEmployee();
        Employee bao = new FullTimeEmployee();
        Employee binh = new ContractorEmployee();
        Employee loc = new ContractorEmployee();

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(tan,nga,bao,binh,loc));
        System.out.println("Total salary is " + salaryController.totalEmployeeSalary(employeeList));
    }
    public int totalEmployeeSalary(List<Employee> employeeList){
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}
