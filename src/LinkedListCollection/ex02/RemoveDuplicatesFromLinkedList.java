package LinkedListCollection.ex02;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromLinkedList {

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> duplicateElements){

        LinkedList <Integer> uniqueElements = new LinkedList<>();

        for(Integer element : duplicateElements){
            if(!uniqueElements.contains(element)){
                uniqueElements.add(element);
            }
        }
        return uniqueElements;
    }

    public static LinkedList<Integer> removeDuplicates2(LinkedList<Integer> duplicateElements){
        LinkedList<Integer> uniqueElements = new LinkedList<>();

        for(Integer element : duplicateElements){
            if(!uniqueElements.contains(element)){
                uniqueElements.add(element);
            }else{
                uniqueElements.remove(element);
            }
        }
        return uniqueElements;
    }

    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,2,7,3,4,5,5,6,7,7,8));
        System.out.println(linkedList);
        System.out.println(removeDuplicates(linkedList));
        System.out.println(removeDuplicates2(linkedList));
    }

}

