package IOFile.serializable;

import java.io.IOException;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) throws IOException {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person p1 = new Person("A", "B", 1983, false, 2.3);
        Person p2 = new Person("D", "E", 1981, false, 3.3);
        personArrayList.add(p1);
        personArrayList.add(p2);

        Person.writeToBinaryFile(personArrayList);
        Person.readFromBinaryFile();

    }
}
