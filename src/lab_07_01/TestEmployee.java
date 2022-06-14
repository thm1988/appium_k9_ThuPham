package lab_07_01;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        SalaryController salaryController = new SalaryController();

        Employee tan = new FullTimeEmployee();
        tan.setName("Tan");
        tan.setAge(38);

        Employee mai = new FullTimeEmployee();
        mai.setName("Mai");
        mai.setAge(39);

        Employee ha = new FullTimeEmployee();
        ha.setName("Ha");
        ha.setAge(48);

        Employee nguyen = new ContractorEmployee();
        nguyen.setName("Nguyen");
        ha.setAge(28);

        Employee manh = new ContractorEmployee();
        ha.setName("Manh");
        ha.setAge(31);

        employeeList.add(tan);
        employeeList.add(mai);
        employeeList.add(ha);
        employeeList.add(nguyen);
        employeeList.add(manh);

        System.out.println("Total salary is: " + salaryController.totalEmployeeSalary(employeeList));
    }
}