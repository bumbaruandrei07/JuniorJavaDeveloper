package interviewProblems;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetterThanTarget(char[] arr, char target) {
        for (char c : arr) {
            if (c > target) {
                return c;
            }

        }
        //daca niciun element din array nu este mai mare decat target atunci returnam primul element din array
        return arr[0];
    }

    //problema rezolvata cu binary search
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end)/2;
            //it might be possible that (start + end) exceeds the range of int in java
            int mid = (start + start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    private static char nextGreatestLetter3(char[] letters, char target) {
        int mindist = 1000;
        char c = 'a';

        for(int i = 0; i < letters.length; i++) {
            int crt_dist = 10000;
            if (target < letters[i]) {
                crt_dist = letters[i] - target;
            } else if (target > letters[i]){
                crt_dist =  letters[i]  + ('z' - 'a' + 1) - target;
            }

            if (mindist > crt_dist) {
                mindist = crt_dist;
                c = letters[i];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b'};
        char target1 = 'z';
        char target2 = 'a';
        char[] arr2 = new char[] {'c','f','j'};
        System.out.println(nextGreatestLetterThanTarget(arr, target1));
        System.out.println(nextGreatestLetter(arr, target1));
        System.out.println(nextGreatestLetter(arr2,target2));
        System.out.println(nextGreatestLetter3(arr,target1));
    }


}
