package JUnit_ParameterizedTests.DefiningAnArgumentConverter.test;

import JUnit_ParameterizedTests.DefiningAnArgumentConverter.main.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith; //used to map our parameters over to the RoleConverter class
import org.junit.jupiter.params.provider.ValueSource; //inputs to the RoleConverter

public class EmployeeConverter {

    @ParameterizedTest //single test case
    @ValueSource(strings = {"developer", "tester", "release engineer", "storage engineer"}) //a value source containing 4 different strings
    //these are 4 potential values for employees in a fictitious organization
    @DisplayName("Role Check")

    //folosim adnotarea @ConvertWith ca sa transformam din lowerCase in UpperCase array-yl de stringuri
    void converterTest(@ConvertWith(RoleConverter.class) String role) {

        Employee employee = new Employee("Brian", "Alford", 1011, 'M', role, 50000.0, "Contract");
        System.out.println("Value of role: " + role);
        Assertions.assertEquals(role, employee.getRole());
    }
}
