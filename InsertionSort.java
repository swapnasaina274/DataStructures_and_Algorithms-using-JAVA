import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // Start from the second element (index 1) as index 0 is assumed sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element currently being positioned
            int j = i - 1;

            /* Move elements of arr[0..i-1] that are greater than the key
               to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Place the key into its correct sorted location
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        
        System.out.println("Original Array: " + Arrays.toString(data));
        
        insertionSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
