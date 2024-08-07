package packageHashTable;

import java.util.Hashtable;

public class Main {
    // Hashtable = A data structure that stores unique keys to values ex. <Integer, String>
    //             Each key/value pair is known as an Entry
    //             FAST insertion, look up, deletion of key/value pairs
    //             Not ideal for small data sets, great with large data sets

    // hashing = takes a key and computes an integer (formula will vary based on key & data type)
    //           In a Hashtable, we use the hash % capacity to calculate an index number

    //           key.hashCode() % capacity = index

    // bucket = an indexed storage location for one or more Entries
    //          can store multiple Entries in case of a collision (Linked similarly a LinkedList)

    // collision = hash function generates the same index for more than one key
    //             less collisions = more efficiency

    // Runtime complexity: Best Case O(1)
    //                     Worst Case O(n)






    public static void main(String[] args) {
        //Hashtable<Integer, String> hashTable = new Hashtable<>(10,0.5f);
        Hashtable<String, String> hashTable = new Hashtable<>(21);
        // add element to hash table
        /*
        hashTable.put(100,"Batman");
        hashTable.put(123,"Superman");
        hashTable.put(321,"Wonderman");
        hashTable.put(555,"Greenlantern");
        hashTable.put(777,"Flash");

         */
        hashTable.put("100","Batman");
        hashTable.put("123","Superman");
        hashTable.put("321","Wonderman");
        hashTable.put("555","Greenlantern");
        hashTable.put("777","Flash");

        //table.remove(777);


        for(String key : hashTable.keySet()){
            // for using Integer key reference type
            //System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + hashTable.get(key));


            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + hashTable.get(key));

        }

    }
}
