package JavaReflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public void list() {
        //in java exista obiecte de tipul class, modul de a lucra cu clase ca si entitati
        Class student = Student.class; // TODO: trebuie creata

        //clasa Method care o sa ne lase sa putem lucra cu metodele respective, sa le interogam pentru a afla informatii despre ele
        Method[] methods = student.getDeclaredMethods(); //getDeclaredMethods() returneaza un array de tipul method care ne spune care sunt metodele definite de clasa Student

        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType()); //valoarea de return a metodei
            System.out.println(Arrays.toString(method.getParameterTypes())); //tipul parametrilor -> returneaza un array
        }
    }

    public static void main(String[] args) {
        new ReflectionExample().list(); //avem acces si la metodele public, dar si cele PRIVATE din Student!
        Student student = new Student("ION", 21);
        //prin obiect putem accesa doar metodele publice, nu si cele private!



    }
}