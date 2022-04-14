package test;

public class EmployeeTest {


    public static void main(String[] args){

        Employee employee = new Employee(20, "Andrei", 200.4);
        System.out.println("Employee age: " + employee.age);
        System.out.println("Employee 1 salary: " + employee.getSalary());

        System.out.println(employee);






    }
}
