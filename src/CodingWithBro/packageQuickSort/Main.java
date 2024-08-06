package packageQuickSort;

public class Main {
    // quick sort(divide and conquer) = moves smaller elements to left of a pivot
    //              recursively divide array in 2 partitions

    // run-time complexity = Best case O(n log(n))
    //                        Average case O(n log(n))
    //                        Worse case O(n^2) - rare only if already sorted

    // space complexity = O(log(n)) due to recursion

    public static void main(String[] args) {
        int[] array = {8,2,5,3,4,9,7,6,1};
        // array, beginning, ending parameters
        quickSort(array, 0 , array.length - 1);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return; // base case
        int pivot = partition(array, start, end);

        // pass in each partition recursively back into quicksort function

        // start and end of left partition - do not want to include our pivot
        quickSort(array, start, pivot - 1);
        // right partition
        quickSort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end){
        // variation of the quick sort function
        // pivot will always be at the end
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            // anything less than pivot, should be on left side of pivot
            // anything larger should be on right side
            if(array[j] < pivot){
                i++;
                // variable swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        // insert pivot into final resting place
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

}
