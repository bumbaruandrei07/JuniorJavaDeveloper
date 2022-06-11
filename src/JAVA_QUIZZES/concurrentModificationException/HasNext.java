package JAVA_QUIZZES.concurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HasNext {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);

        Iterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()) {
//            While iterating over a List, you cannot alter it
//            This is called concurrent modification, thus the exception ConcurrentModificationException.
            System.out.println(myIterator.next());
            myList.add(3);
        }

    }

}
