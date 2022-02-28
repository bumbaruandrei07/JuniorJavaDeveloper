package C06.homework;

public class Main {

    public static void main(String[] args) {

        MyIntArrayList firstArray = new MyIntArrayList(9);
        MyIntArrayList secondArray = new MyIntArrayList(2);

        //adding new elements to the firstArray
        firstArray.add(1);
        firstArray.add(2);
        firstArray.add(3);
        firstArray.add(4);
        firstArray.add(5);
        System.out.println("Contains 0? Answer: " + firstArray.contains(0));
        System.out.println("Contains 1? Answer: " + firstArray.contains(1));
        System.out.println("First array: " + firstArray);
        System.out.println("Removing the element with value 4");
        firstArray.remove(4);

        System.out.println("First array: " + firstArray);
        System.out.println(firstArray.removeElementAtIndex(1));
        System.out.println("Removing the element from index 1");
        System.out.println("First array: " + firstArray);
        System.out.println("First array: " + firstArray);
        System.out.println("The last index of value 1 in firstArray is: " + firstArray.lastIndexOf(1));
        System.out.println("The last index of value 2 in firstArray is: " + firstArray.lastIndexOf(3));
        System.out.println("The index for value 1: " + firstArray.indexOf(1));
        System.out.println("The index for value 5: " + firstArray.indexOf(5));
        firstArray.add(3);
        System.out.println("The last index of value 3 in firstArray is: " + firstArray.lastIndexOf(3));
        System.out.println("The element from the index 2 is: " + firstArray.get(2));
        secondArray.add(4);
        secondArray.add(7);
        secondArray.add(8);
        firstArray.addAll(secondArray);
        System.out.println("The size of the first array: " + firstArray.size());
        System.out.println("The size of the second array: " + secondArray.size());
        System.out.println("First array + second array: " + firstArray);
        System.out.println(firstArray.removeElementAtIndex(4));
        System.out.println("First array + second array: " + firstArray);
        System.out.println("Second array : " + secondArray);
        System.out.println(firstArray.get(2));
        System.out.println(firstArray.size());
        firstArray.trimToSize();
        System.out.println(firstArray.size());

        System.out.print("The elements from the first array are: ");
        for (int i = 0; i < firstArray.size(); i++) {
            System.out.print(firstArray.get(i) + " ");
        }
        System.out.println();
        System.out.println("ArrayList can now surely store up to 400 elements ");
        firstArray.ensureCapacity(400);
        System.out.println("The size of the first arrayList: " + firstArray.size());
        System.out.println(firstArray.set(8, 2)); //return -1 case
        System.out.println(firstArray.set(0, 120)); //index 0 -> 120
        System.out.print("The elements from the first array are: ");
        for (int i = 0; i < firstArray.size(); i++) {
            System.out.print(firstArray.get(i) + " ");
        }
        //cleaning
        firstArray.clear();
        System.out.println(secondArray.size());
        System.out.println(firstArray.size());
    }
}
