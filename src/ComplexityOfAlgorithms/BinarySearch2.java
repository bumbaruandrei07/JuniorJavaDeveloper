package ComplexityOfAlgorithms;

public class BinarySearch2 {
    public static int binarySearchAux(int[] sortedList, int left, int right, int key) {
        if (left > right) { // value not found
            return -1;
        }

        int middle = (left + right) / 2;
        if (key == sortedList[middle]) {
            return middle; //returnam pozitia daca key-ul este egal elementul din mijloc
        } else if (key < sortedList[middle]) { //mergem in stanga
            return binarySearchAux(sortedList, left, middle - 1, key); //apelam recursiv,
            // primeste array-ul, capatul din stanga, dreapta si ce cautam,
            // daca cautam la stanga, pastram lista, cel din stanga si cheia, insa right devine middle -1
        } else {
            return binarySearchAux(sortedList, middle + 1, right, key); //daca e mai mare, actualzam capatul din stanga cu middle + 1
        }
    }

    // returns element index in list OR -1 for "not found"
    public static int binarySearchR(int[] sortedList, int key) {
        return binarySearchAux(sortedList, 0, sortedList.length - 1, key);
    }

    public static void main(String[] args) {
        int [] array = new int[] {4,5,61,12,3,45,6};
        System.out.println(binarySearchR(array,2));
        System.out.println(binarySearchR(array,12)); // output : 3
    }
}
