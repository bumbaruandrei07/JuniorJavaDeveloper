package JUnit_ParameterizedTests.WorkingWithDifferentParameterSources.test;

import JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource; // this will pass along a null value as the parameter value to our parameterized test
import org.junit.jupiter.params.provider.EmptySource; // to provide an empty value as the parameter to a test case

public class EmployeeTest {

    @ParameterizedTest
    @NullSource // a null value will be supplied
    @DisplayName("Null Name Check")
    void nullName (String name){
       Employee employee = new JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee(name, name, 1011, 'M', "Tester", 50000.0, "Contract");
        Assertions.assertNull(employee.getFirstName()); //first name will be null
        Assertions.assertNull(employee.getLastName()); // last name will be null
    }

    @ParameterizedTest
    @EmptySource // an empty value will be supplied
    @DisplayName("Empty Name Check")
    void emptyName (String name){
        Employee employee = new JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee(name, name, 1011, 'M', "Tester", 50000.0, "Contract");
        //verificam daca atat firstName, cat si lastName sunt empty strings (stringuri fara caractere)
        Assertions.assertEquals("", employee.getFirstName());
        Assertions.assertEquals("", employee.getLastName());

    }

}
