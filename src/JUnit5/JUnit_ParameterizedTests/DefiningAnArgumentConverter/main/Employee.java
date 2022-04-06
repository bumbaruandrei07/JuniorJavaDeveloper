package JUnit5.JUnit_ParameterizedTests.DefiningAnArgumentConverter.main;

import javax.naming.InvalidNameException;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    String firstName;
    String lastName;
    Integer id;
    Character gender;
    String role;
    Double salary;
    String type;
    ArrayList<String> projects;

    //constructor in order to initialize an employee
    public Employee(String firstName, String lastName, Integer id, Character gender, String role, Double salary, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
        this.type = type;
        this.projects = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public Character getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }

    public Double getSalary() {
        return salary;
    }

    public String getType() {
        return type;
    }

    public void adjustSalary(double adjAmount) {

        //UPDATING OUR TEST
        if (adjAmount > 5000) {
            System.out.println("The increment exceeds the limit. Applying a 5k increase...");
            adjAmount = 5000;
        }

        System.out.println("Updating salary from " + salary + " to " + (salary + adjAmount));
        salary = salary + adjAmount;
    }

    public void validateLastName() throws Exception {
        if (!this.lastName.matches("^[a-zA-Z]*$")) {
            throw new InvalidNameException("The last name can only contains letters");
        }
    }

    public void addProject(String projectName) {
        projects.add(projectName);
    }

    public List<String> getProjects() {
        return projects;
    }


}
