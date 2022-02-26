package C06.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class MyIntArrayList {

    ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
    private int[] elements;
    private int size;

    public MyIntArrayList() {
        this(10);
    }

    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }


    public boolean add(int e) {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[size] = e;
        this.size++;
        return true;
    }

    public int size() {
        return this.size;
    }

    public int indexOf(int e) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to" +
                    " remove element at position " + index);
            return -1;
        }

        int removedElement = this.elements[index];
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return removedElement;
    }

    public void clear() {
        this.size = 0;
    }

    public int set(int index, int e) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                    " the element " + e + " at position " + index);
            return -1;
        }

        int replacedElement = this.elements[index];
        this.elements[index] = e;
        return replacedElement;
    }

    public boolean remove(int element) {
        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == element) {
                index = i;
                break;
            }
        }

        //corner case
        if (index != -1) {
            for (int i = index; i < this.size; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.size--;
        }
        return index != -1;
    }


    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (element == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int lastIndexOf(int element) {
        for (int i = 0; i >= 0; i--) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }


    public boolean addAll(MyIntArrayList myIntArrayList) {
        if (myIntArrayList.size() == 0) {
            return false;
        }
        int newArrayCapacity = this.size + myIntArrayList.size;
        int iterator = 0;

        for (int i = this.size; i < newArrayCapacity; i++) {
            this.size++;
            if (this.size == this.elements.length) {
                this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
            }
            this.elements[i] = myIntArrayList.get(iterator++);
        }
        return true;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        return elements[index];
    }


    public void ensureCapacity(int minCapacity) {

//        my first approach
//        if (minCapacity < this.size) {
//            return;
//        }
//        this.size = minCapacity;

        elements = Arrays.copyOf(elements, minCapacity);
    }

    public void trimToSize() {
        this.elements = Arrays.copyOf(this.elements, size);
    }

    public int[] toArray() {
        int[] array = new int[this.size];
        for (int i = 0; i < this.size; ++i) {
            array[i] = this.elements[i];
        }
        return array;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }

}