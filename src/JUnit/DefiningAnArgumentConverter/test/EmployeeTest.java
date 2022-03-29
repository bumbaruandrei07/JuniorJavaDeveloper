package JUnit.DefiningAnArgumentConverter.test;

import JUnit.RunningParameterizedTestsWithValueSource.main.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import javax.naming.InvalidNameException;
import java.util.stream.Stream;

public class EmployeeTest {

    static Stream<String> getLastNames() {

        return Stream.of("Al4d", "B3nson", "$mith", "@lford");
    }

    @ParameterizedTest(name = "Test #{index} - Last name: {0}") // index corresponding to an individual run of the test case wiht a set of parameters
    // {0} we want to use as parameters last name at index 0
    @MethodSource("getLastNames")
    @DisplayName("Name Check")
    void nameTest(String lName) {

        Employee employee = new JUnit.RunningParameterizedTestsWithValueSource.main.Employee("Brian", lName, 1011, 'M', "Tester", 50000.0, "Contract");
        Assertions.assertThrows(InvalidNameException.class,
                () -> {
                    employee.validateLastName();
                },
                "Throws Exception Test");
    }
}

