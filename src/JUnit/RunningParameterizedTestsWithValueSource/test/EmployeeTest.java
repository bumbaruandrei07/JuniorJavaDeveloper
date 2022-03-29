package JUnit.RunningParameterizedTestsWithValueSource.test;

import JUnit.RunningParameterizedTestsWithValueSource.main.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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


    @ParameterizedTest //this is an annotation which we need to use before a test case, which accepts a parameter / argument
    //the valueSource is the source for our parameter, allows us to specify parameters to be passed to a test case
    // in the form of an array of literal values
    // Effectively, it allows us to hard-core the parameters to be passed
    @DisplayName("Salary Update") //the display name for this particular test case is "Salary Update"
    @ValueSource(doubles = {500,1000,1300,2400,3500,4000,6000}) //we define an array of double values to be passed along as parameters to out salaryUpdateTest
    //in the first run, a salary increment of 500 will be applied, 1000 on the second, then 1300, 2400, 3500 and 4000
    // so, the salaryUpdateTest is set to run six times, once with each of the parameters specified


        //we add an argument to this methid -> salaryIncrement

    //this is a test case which takes in a salary increment as a parameter
    void salaryUpdateTest(double salaryIncrement) {

        employee.adjustSalary(salaryIncrement);
        salary += salaryIncrement;

        assertEquals(salary, employee.getSalary(), "Test salary updated");
        //assertEquals indica daca testul este valid sau nu
        // este valid daca salary este egal cu employee.getSalary().
        // salary este salariul din clasa test
        // employee este obiectul de tip Employee ce contine salariul prin apelul getterului getSalary() din clasa de baza

        //la 6000 o sa avem test failed pentru ca daca este > 6000 o sa l updateze la 5000
        // iar 6000 != 5000 ...
        //AssertionFailedError occured
    }



}
