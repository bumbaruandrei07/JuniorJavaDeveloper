package LinkedList;

public class DeleteNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static void deleteNode(ListNode node) {

        node.val = node.next.val;   //ii dam nodului curent valoarea nodului urmator
        node.next = node.next.next; // nodul urmator va fi de fapt nodul urmator nodului urmator
    }

    public static void main(String[] args){
        ListNode node;




    }

}
