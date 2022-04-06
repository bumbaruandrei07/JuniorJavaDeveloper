package LinkedList.homework;

public class RemoveDuplicates {

    int val;
    RemoveDuplicates next;

    RemoveDuplicates() {
    }

    RemoveDuplicates(int val) {
        this.val = val;
    }

    RemoveDuplicates(int val, RemoveDuplicates next) {
        this.val = val;
        this.next = next;
    }


    public RemoveDuplicates deleteDuplicates(RemoveDuplicates head) {


        if (head == null) {
            return head;
        }

        RemoveDuplicates newNode = head;

        while (newNode.next != null) {
            if (newNode.val == newNode.next.val) {
                newNode.next = newNode.next.next;
            } else {
                newNode = newNode.next;
            }
        }

        return head;
    }

}
