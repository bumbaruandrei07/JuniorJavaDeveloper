package radixSort;

public class RadixSortAscending {


    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Queue {

        private Node head, tail;


        public boolean isEmpty() {
            return head == null;
        }

        public void enqueue(int data) {
            //creating a new Node to the queue
         Node node = new Node(data);
            // if the head is empty we will point head to tail
            if (head == null) {
                head = node;
            }
            // if tail is not empty, the value after the current tail is the new node
            else if (tail != null) {
                tail.next = node;
            }
            tail = node;
        }


        public int dequeue() {
            //returning data since it now stores head
            int data = head.data;
            //setting the new head to the next value
            head = head.next;
            //setting tail to node if the new head value since it's moved over is null
            if (head == null) {
                tail = null;
            }
            return data;
        }
    }


    public static int getMaxBase(int[] arr, int length) {
        int max = arr[0];

        for (int i = 1; i < length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int maxBase = 1;
        //getting the largest base
        for (int i = max; i > 1; i /= 10) {
            maxBase = maxBase * 10;
        }
        maxBase = maxBase / 10;
        return maxBase;
    }

    public static int[] copy(int[] arr, int length) {
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }


    public static void sortID(int[] arr, int maxBase) {

        //create a queue for 10 buckets
        Queue[] queues = new Queue[10];

        //add the buckets 0-9 to the queue

        for (int i = 0; i < 10; i++) {
            queues[i] = new Queue();
        }

        //fill buckets, going through the powers of 10
        for (int powerOf10 = 1; powerOf10 <= maxBase; powerOf10 *= 10) {
            //examing the values in the array
            for (int i = 0; i < arr.length; i++) {
                //queueing into the array whatever digits there are
                int digit = getDigit(arr[i], powerOf10);
                queues[digit].enqueue(arr[i]);
            }
            int item = 0;
            //9 is the max queue size
            //iterating descending
            for (int queueNum = 0; queueNum < 10; queueNum++) {

                for (; !queues[queueNum].isEmpty(); item++) {
                    arr[item] = queues[queueNum].dequeue();
                }

            }
        }
        toString(arr);
    }


    private static int getDigit(int i, int powerOf10) {
        return (i / powerOf10) % 10;
    }

    private static void toString(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }


    public static void main(String[] args) {

        int[] arr = {73, 481, 57, 23, 332, 800, 754, 125};
        System.out.println("Initial array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array in ascending order with Radix sort: ");
        int maxBase = getMaxBase(arr, arr.length);

        sortID(arr, maxBase);


    }
}

