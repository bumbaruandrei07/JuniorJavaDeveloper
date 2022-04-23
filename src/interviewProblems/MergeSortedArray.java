package interviewProblems;

public class MergeSortedArray {
    public static void merge(int[] array1, int m, int[] array2, int n) {
        m--;
        n--;

        while (n >= 0) {
            if(m < 0 || array1[m] < array2[n]){
                array1[n+m+1] = array2[n];
                n--;
            }
            else{
                array1[n+m+1] = array1[m];
                m--;
            }
        }

    }
    public static void main(String[] args){

    }
}
