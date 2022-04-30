package interviewProblems;

public class JewelsStones {

    private static int numJewelsInStones(String jewels, String stones) {

        int matches = 0;

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); ) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    matches++;

                }
                j++;
            }
        }


        return matches;
    }


    public static void main(String[] args) {
        //How many times a stone is a jewel ?
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

}
