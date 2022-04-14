package test;

public class Employee {

    public int age;
    private String name;
    private double salary;

    public Employee(){}

    public Employee(String name){
        this.name = name;
    }



    public Employee(int age, String name, double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
