package LinkedList;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    public Node(E value) {
        this(value, null);
    }

    public Node() {}

    public void value(E value) {
        this.value = value;
    }

    public E value() {
        return value;
    }

    public Node<E> next() {
        return next;
    }

    public void next(Node<E> next) {
        this.next = next;
    }

    public static int useList2(Node<Integer> list) {
        int count = 0;
        while (list.next() != null && list.next().next()!= null) {
            list = list.next();
            count++;
        }

        return count;
    }
}