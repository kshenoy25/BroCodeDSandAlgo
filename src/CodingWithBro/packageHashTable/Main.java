package packageHashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        //Hashtable<Integer, String> hashTable = new Hashtable<>(10,0.5f);
        Hashtable<String, String> hashTable = new Hashtable<>(10);
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


            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + hashTable.get(key));

        }

    }
}
