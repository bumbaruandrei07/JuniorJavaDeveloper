package TrickyProblems.interview;

public class CountOccurrences {


    //method I
    public static int countOccurrences(int[] array, int key) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                counter++;
            }
        }
        return counter;
    }



//    Method 2 - using binary search to optimize the performance of the algorithm
//public static int countOccurrencesWithBinarySearch(int[] array, int key) {
//
//
//
//
//}



    public static void main(String[] args) {
        System.out.println("Checking input...");

        int[] array = {0, 2, 3, 5, 5, 5, 8, 11, 11, 101};

        int rez = countOccurrences(array, 11);
        System.out.println("You got: " + rez + " Correct: " + 2);

        int check2 = countOccurrences(array,0);
        System.out.println("0's appereances: " + check2);

//        int check3 = countOccurrencesWithBinarySearch(array,11);
//        System.out.println("11's appereances: " + check3);
    }
}
