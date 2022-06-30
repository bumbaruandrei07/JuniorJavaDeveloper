package concurrency;

public class PrintMessageThread extends Thread {
    private int counter;
    private String name;

    public PrintMessageThread(int counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.counter; i++) {
            System.out.println("[" + this.name + "] Hello multi-tasking world! (" + i + ")");
        }
    }
}
