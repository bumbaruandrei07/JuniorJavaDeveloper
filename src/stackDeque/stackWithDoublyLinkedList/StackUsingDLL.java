package stackDeque.stackWithDoublyLinkedList;

public class StackUsingDLL {

    //componeneta de tipul doubly linked list ce ca fi folosita pentru implementarea stivei
    private DLL list = null;

    //constructor
    public StackUsingDLL() {
        this.list = new DLL();
    }
    //metoda pentru adaugare
    public void push(int data) {
        list.add(data);
        System.out.println(data + " inserted into stack");
    }
    //metoda pentru stergerea unui element din stiva
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        //get the peek of stack
        int data = peek();
        list.remove(size() - 1);
        System.out.println(data + " removed from stack");
    }

    public int peek() {
        return list.get(size() - 1);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        StackUsingDLL s = new StackUsingDLL();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println("Top Element is " + s.peek());
        System.out.println(s);
        System.out.println("Size of the Stack is " + s.size());
        System.out.println("Is Stack EMpty : " + s.isEmpty());
        s.pop();
        s.pop();
        System.out.println(s);
        System.out.println("Size of the Stack is " + s.size());
        s.pop();
        System.out.println("Is Stack EMpty : " + s.isEmpty());

    }
}