package JUnit5.JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.test;

import JUnit5.JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.naming.InvalidNameException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParametrizeLastName {

    @ParameterizedTest
    @DisplayName("Last Name Check")
    @ValueSource(strings = {"Al4d", "B3nson", "$mith", "@lford"}) //we pass an array of strings
    void nameTest(String lastName) {
        Employee employee = new Employee("Brian", lastName, 1011, 'M', "Tester", 50000.0, "Contract");

        assertThrows(InvalidNameException.class,
                () -> {
                    employee.validateLastName();
                }, "Throws Exception test");
    }
}

