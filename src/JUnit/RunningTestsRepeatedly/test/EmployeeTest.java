package JUnit.RunningTestsRepeatedly.test;

import JUnit.RunningTestsRepeatedly.main.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    static Employee employee;
    static double salary;

    //this method is set to run before all test cases
    @BeforeAll
    static void initEmployee() {

        salary = 45000;
        employee = new Employee("Brian", "Alford", 1011, 'M', "Tester", salary, "Contract");
    }

    //the body of my test case is set to run 5 times
    @RepeatedTest(5)
    @DisplayName("Salary Update")

    void salaryUpdateTest() {

        double salaryIncrement = 2000.0;
        employee.adjustSalary(salaryIncrement);
        salary += salaryIncrement;

        assertEquals(salary, employee.getSalary(), "Test salary updated");
    }



}
