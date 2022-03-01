package C13_Matrix.quiz;


//elementele o sa alterneze ca semn -> la pasul curent o sa fie negativ -> apoi pozitiv


//TODO What is the output?
public class Ex03 {
    public static void main(String[] args){
        int dim = 4;
        int[][] temperatures = new int[dim][dim];
        int factor = 1;

        for (int i=0; i<temperatures.length; i++) {
            for (int j=0; j<temperatures[i].length; j++) {

                factor++;
                factor *= -1;

                temperatures[i][j] = factor;
            }
        }

        for(int i=0; i<temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                System.out.print(temperatures[i][j] + " ");
            }
            System.out.println();
        }
    }
}
