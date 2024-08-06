package packageMergeSort;

public class Main {
    // merge sort = recursively divide array in 2, sort, then re-combine
    //              run-time complexity = O(n log n)
    //              space complexity = O(n)
    // NOTE ********************************
    // When checking for output errors in code look for correct bracket format

    public static void main(String[] args) {
        int[] array = {8,2,5,3,4,7,6,1};

        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;

        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array
        // can use ';' for reuse of i from for loop in main traversal
        for (; i < length; i++) {
            if (i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }
    // helper method
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                // comparing number from left and right
                // adding whatever number is smaller back into array
                array[i] = leftArray[l];
                i++;
                l++;
            }

            // if number on left is not smaller than right
            // copy element in right array to the original array
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
            // one element remaining where comparison could not happen since it is the last element
            while (l < leftSize){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            while (r < rightSize){
                array[i] = rightArray[r];
                i++;
                r++;

            }
        }
    }
