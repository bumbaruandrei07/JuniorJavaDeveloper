package TrickyProblems.interview;


public class TopElement {

    //returneaza elementul din vector care este mai mare decat vecinii sai
    // Traverse array from index 1 to n-2
    // and check for the given condition
    public static int searchForTopElement(int[] array, int n) {
        for (int i = 1; i < n - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return array[i];
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        int[] tests = new int[]{1, 2, 3, 4,5,1};
        for (int i = 0; i < tests.length; i++) {
            System.out.println("Element at index: " + i + " is: " + tests[i]);
            System.out.println("Last element is: " + tests[tests.length - 1]);
            System.out.println("Antepenultimul element este: " + tests[tests.length - 2]);

        }
        int n = tests.length;

        System.out.println(searchForTopElement(tests,n));


    }
}
