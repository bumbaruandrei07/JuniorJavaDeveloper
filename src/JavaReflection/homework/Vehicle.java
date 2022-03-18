package JavaReflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {
    private final String serialNumber;
    private int noPersons;
    private String name;

    public Vehicle(String serialNumber, int noPersons, String name) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    public Vehicle(String serialNumber, int noPersons) {
        this(serialNumber, noPersons, "");
    }

    private void displaySerialNumberAndPassword() {
        System.out.println("Method hacked: " + serialNumber);
        System.out.println("Password is: " + "dsf98fsd98!{dev}hack!345m");
    }

    public int getNoPersons() {
        return noPersons;
    }

    public void setNoPersons(int noPersons) {
        this.noPersons = noPersons;
    }

    private boolean changeNoPersons(int no) {
        this.noPersons = no;
        return true;
    }


    public void list() {
        Class vehicle = Vehicle.class;
        Method[] methods = vehicle.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    // metoda cu numar nedeterminat de parametri (observa '...')
    public static Object invocareMetodaPrinReflection(Object obj, String numeMetoda, //obiectul pe care apelam metoda, metoda.
                                                      Object... setDeParametri) { //Object... inseamna numar variabil de parametri
        int numarParametri = setDeParametri.length; //setDeParametri -: apela o metoda cu nr. variabil de parametri si care vor fi pusi int-run array de obiecte de tipul Object
        Method metodaApelata;
        Object valoareReturn = null;
        Class<?>[] tipurileParametrilor = new Class<?>[numarParametri]; //array cu tipul parametrilor
        for (int i = 0; i < numarParametri; i++) {
            tipurileParametrilor[i] = setDeParametri[i].getClass();
        }
        try {
            metodaApelata = obj.getClass().getDeclaredMethod(
                    numeMetoda, tipurileParametrilor);
            metodaApelata.setAccessible(true);
            valoareReturn = metodaApelata.invoke(obj, setDeParametri);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return valoareReturn;
    }

    public static void main(String[] args) {

        Vehicle nissan = new Vehicle("9191", 4);
        Method firstMethod = Vehicle.class.getDeclaredMethods()[0];
        System.out.println(invocareMetodaPrinReflection(nissan, "displaySerialNumberAndPassword"));

//        try {
//            Class<Vehicle> vehicleClass = Vehicle.class;
//            /**
//             * Return the field object of this class specified by noPersons
//             */
//            Field noPersonsField = vehicleClass.getDeclaredField("noPersons");
//            System.out.println("Field name: " + noPersonsField.getName());
//            System.out.println("Field Type: " + noPersonsField.getType());
//
//            Vehicle vehicle = vehicleClass.newInstance();
//            /**
//             *
//             * Sets the field represented by this field object on the specified
//             * object argument to the specified new value
//             */
//
//            noPersonsField.set(vehicle,20);
//            Object newNoOfPersons = noPersonsField.get(vehicle);
//            System.out.println("New capacity:  " + newNoOfPersons);
//
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        try {
            Class<?> vehicleClass = nissan.getClass();
            Field newCapacity = vehicleClass.getDeclaredField("noPersons");

            System.out.println("Initial capacity: " + nissan.getNoPersons());
            newCapacity.setInt(nissan, nissan.getNoPersons() * 2);

            System.out.println("The new capacity is: " + nissan.getNoPersons());


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}



