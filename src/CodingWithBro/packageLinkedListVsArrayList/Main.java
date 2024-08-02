package packageLinkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Accessing elements is faster in ArrayList than LinkedList
        // LinkedList might be better if involving a lot of deleting and inserting with large data sets

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // long = very large integer
        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++) {
            // can add primitives due to autoboxing feature
            // autoboxing = automatic conversion that the Java compiler makes between primitive
            // types and their corresponding object wrapper classes
            linkedList.add(i);
            arrayList.add(i);

        }

        // **********************LinkedList**********************
        // Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds
        startTime = System.nanoTime();

        //linkedList.get(999999);
        //linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        // \t = tab
        System.out.println("LinkedList:\t " + elapsedTime + " ns");


        //**********************ArrayList**********************

        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t " + elapsedTime + " ns");
    }
}
