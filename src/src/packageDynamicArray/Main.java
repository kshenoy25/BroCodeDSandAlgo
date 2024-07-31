package packageDynamicArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Dynamic Array (ArrayList)      resizable capacity - if need extra room for elements
        //                                has an inner static array with a fixed size
        // advantages of Dynamic Arrays?
        // 1) Random access of elements O(1) constant time
        // 2) Good locality of reference and data cache utilization
        // 3) Easy to insert/delete at the end

        // disadvantages?
        // 1) Wastes more memory than a LinkedList
        // 2) Shifting of elements is time-consuming
        // 3) Expanding/Shrinking the array is time consuming O(n) time


        // Static Array                   has a fixed capacity

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        //System.out.println(dynamicArray.capacity);


    }
}
