package JavaReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ComplexReflectionExample {
    public static class Student {
        private String testMethod(Integer a, String concluzie) {
            return "Sunt student la Academia Devmind" + a + concluzie;
        }
    }

    public void list() {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

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
        Class<?>[] tipurileParametrilor = new Class<?>[numarParametri]; //array cu tipul parametrilor.
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
        Student student = new Student();
        Method primaMetoda = Student.class.getDeclaredMethods()[0]; //apelam metoda care returneaza un array cu obiecte de tipul method si accesam obiectul de pe pozitia 0, accesam metoda ca obiect
        System.out.println(invocareMetodaPrinReflection(student, //folosim obiect, numele metodei si parametri!
                primaMetoda.getName(), 1, " CONCLUZIE!!!!"));


    }
}