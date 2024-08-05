package packageSelectionSort;

public class Main {
    // selection sort = search through an array and keep track of the minimum value during each iteration.
    //                  At the end oof each iteration, we swap variables.

    //                  Quadratic time O(n^2)
    //                  small data set = okay
    //                  large data set = BAD :/

    public static void main(String[] args) {
        int[] array = {4,6,9,2,7,5,12,10};

        selectionSort(array);
        for (int i : array){
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // keep track of minimum
            int min  = i;
            for (int j = i + 1; j < array.length; j++) {
                // ascending order ">" and descending order "<"
                if(array[min] < array[j]){
                    min = j;
                }
            }
            // outside of for loop we do variable swapping
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
}
