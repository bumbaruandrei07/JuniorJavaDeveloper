package ComplexityOfAlgorithms;

//varianta recursiva
public class BinarySearch1 {
    //are complexitate logaritmica , pentru ca injumatatim intervalul de cautare la fiecare pas -> O(log2n)
    //primeste un array si un key pe care il cautam in array
    public static int binarySearchI(int[] sortedList, int key) {
        // setam capetele si din dreapta, cautam in intreg array-ul
        int left = 0, right = sortedList.length - 1;
        //conditie de oprire: capatul din stanga sa fie mai mic sau egal decat cel din dreapta, daca cele doua capete se invserseaza, atunci oprim cautarea, nu am gasit elementul
        while (left <= right) {
            int middle = (left + right) / 2; //calculam elementul din mijloc
            if (key == sortedList[middle]) { //daca este egal cu cel din mijloc il returnez
                return middle;
            } else if (key < sortedList[middle]) { //daca este mai mic decat cel din mijloc mergem in partea din stanga
                right = middle - 1; // cel din stanga ramane constant, cel din dreapta il actualizam la mijloc - 1
            } else if (key > sortedList[middle]) { //daca e mai mare atunci cautam mai in dreapta decat cel din mijloc
                left = middle + 1; //capatul din stanga merge la middle + 1
            }
        }
        //indica pozitia unde ar trebui sa fie inserat in lista key-ul daca acesta nu exista, astfel incat array-ul sa ramana sortat
        System.out.println("Key-ul nu exista in array! Pozitia unde ar trebui sa fie inserat key-ul astfel incat arra-ul sa ramana sortat: ");
        return left;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 6, 5, 1, 9};
        int key = 7;
        int key2 = 5;
        System.out.println(binarySearchI(array, key)); // output = -1
        System.out.println();
        System.out.println(binarySearchI(array, key2)); // output = 2 (2 means the location of the key in my array)

    }
}
