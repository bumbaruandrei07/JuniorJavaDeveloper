package stackDeque.queueWithCircularArray;


import java.util.ArrayList;

public class CircularQueue {


    private int size, front, rear;

    private ArrayList<Integer> queue = new ArrayList<Integer>();

    // Constructor
    private CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    //metoda pentru adaugarea unui element nou in coada
    public void enQueue(int data) {

        // daca dimensiunea cozii este plina
        if ((front == 0 && rear == size - 1) ||
                (rear == (front - 1) % (size - 1))) {
            System.out.print("Queue is Full");
        }

        // daca coada este goala
        else if (front == -1) {
            front = 0;
            rear = 0;
            queue.add(rear, data);
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            queue.set(rear, data);
        } else {
            rear = (rear + 1);

            //adaugam un nou element daca front este mai mic sau egal decat rear (back)
            if (front <= rear) {
                queue.add(rear, data);
            }

            // daca nu atunci doar actualizam vechea valoare din coada
            else {
                queue.set(rear, data);
            }
        }
    }

    //metoda pentru a extrage un element din coada si a-l returna
    public int deQueue() {
        int temp;

        // daca coada este goala
        if (front == -1) {
            System.out.print("Queue is Empty");
            return -1;
        }
        //variabila preia primul elementul front al cozii
        temp = queue.get(front);

        // daca coada contine doar un element atunci front = rear
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }

        // returnam elementul extras
        return temp;
    }

    // metoda pentru afisarea elementelor cozii
    public void displayQueue() {

        // daca coada este goala
        if (front == -1) {
            System.out.print("Queue is Empty");
            return;
        }

//       Dacă spatele nu a depasit dimensiunea maxima
//        sau daca rear este mai mare sau egal decat front
        System.out.print("Elements in the " +
                "circular queue are: ");

        if (rear >= front) {

           //afisam elementele de la front pana la rear
            for (int i = front; i <= rear; i++) {
                System.out.print(queue.get(i));
                System.out.print(" ");
            }
            System.out.println();
        }

       // Dacă spatele a depasit indicele maxim
        else {

            //afisarea elementelor de la front la dimensiunea cozii
            for (int i = front; i < size; i++) {
                System.out.print(queue.get(i));
                System.out.print(" ");
            }

           //afisarea elementelor de la 0 la rear
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue.get(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(13);
        q.enQueue(-6);

        q.displayQueue();

        int x = q.deQueue();

        // verificam daca coada este goala
        if (x != -1) {
            System.out.print("Deleted value = ");
            System.out.println(x);
        }

        x = q.deQueue();

        // verificam daca coada este goala
        if (x != -1) {
            System.out.print("Deleted value = ");
            System.out.println(x);
        }

        q.displayQueue();

        q.enQueue(9);
        q.enQueue(20);
        q.enQueue(5);

        q.displayQueue();

        q.enQueue(20);
    }
}