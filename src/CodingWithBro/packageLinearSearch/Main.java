package packageLinearSearch;

public class Main {
    // Linear Search = iterate through a collection, one element at a time
    //                 run time complexity O(n)

    //                 Disadvantages?
    //                 - slow for large data sets

    //                 Advantages?
    //                 Fast for searches of small to medium data sets
    //                 Does not need to be sorted
    //                 Useful for data structures that do not have random access (LinkedList)
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 10);

        // condition for if the index is not a sentinal value
        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found :(");
        }

    }

    private static int linearSearch(int[] array, int value) {
            // linear search = loop through one array at a time
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            // do not find the element and return as a sentinal value
            return -1;
    }

}
