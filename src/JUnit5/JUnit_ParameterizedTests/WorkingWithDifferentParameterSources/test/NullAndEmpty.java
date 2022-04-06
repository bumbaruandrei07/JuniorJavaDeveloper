package JUnit5.JUnit_ParameterizedTests.WorkingWithDifferentParameterSources.test;

import JUnit5.JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.CsvSource; //allows us to specify multiple parameters for a particular test case in the form of comma-separated values
import org.junit.jupiter.params.provider.CsvFileSource; //using a csv file

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NullAndEmpty {

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Empty Name Check")
    void nameTest(String name) {
        Employee employee = new JUnit5.JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee(name, name, 1011, 'M', "Tester", 50000.0, "Contract");
        String fName = employee.getFirstName();

        //we check if first name is either equal to null or it is empty
        assertTrue(fName == null || fName.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({"Brian, Alford", "Amy, Cruz", "Raj, Cwawanda"}) //we pass an array of comma-separated strings
    //1st member is "Brian, Alfrod"
    //fName - Brian
    //lName - Alford
    //and so on...
    @DisplayName("Name Check")
    void nameTest2(String fName, String lName) {

        //trim() is used to remove whiteSpaces from fName and lName
        Employee employee = new JUnit5.JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee(fName.trim(), lName.trim(), 1011, 'M', "Tester", 50000.0, "Contract");

        Assertions.assertEquals(fName.trim(), employee.getFirstName());
        Assertions.assertEquals(lName.trim(), employee.getLastName());

    }


    @ParameterizedTest
    //in cazul meu nu o sa mearga pentru ca trebuie pus fisierul csv in cadrul src-ului, nu in cadrul package-ului de Junit
    @CsvFileSource(resources = "/input.csv", numLinesToSkip = 1) //sarim cu 1 pt ca pe prima linie avem lname si fname, nu date de intrare
    @DisplayName("Name Check")

    void nameTest3(String fName, String lName){
        Employee employee = new JUnit5.JUnit_ParameterizedTests.RunningParameterizedTestsWithValueSource.main.Employee(fName.trim(), lName.trim(), 1011, 'M', "Tester", 50000.0, "Contract");
        Assertions.assertEquals(fName.trim(), employee.getFirstName());
        Assertions.assertEquals(lName.trim(), employee.getLastName());
    }


}
