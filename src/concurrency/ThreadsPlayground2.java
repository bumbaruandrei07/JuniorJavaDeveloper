package concurrency;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsPlayground2 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int n = 5; // the program will create 5 threads

        ArrayList<PrintMessageThread> threadPool = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            threadPool.add(new PrintMessageThread(1 + random.nextInt(4), "" + i + i + i));
        }

        for (Thread thread : threadPool) {
            thread.start();
        }
    }
}
