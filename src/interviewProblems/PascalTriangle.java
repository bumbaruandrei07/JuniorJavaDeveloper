package interviewProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>(); //initializare lista de liste

        if (numRows == 0) { //avem 0 randuri
            return triangle; //lista este goala si o returnam
        }

        List<Integer> firstRow = new ArrayList<>(); // initializarea listei ce va reprezenta randul 1
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {

                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);
            triangle.add(row);

        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
        System.out.println(generate(0));
        System.out.println(generate(2));
    }


}
