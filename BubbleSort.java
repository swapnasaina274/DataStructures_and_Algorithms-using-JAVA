import java.util.Arrays;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop compares adjacent elements
            // (n - i - 1) ignores elements that are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // Mark that a swap occurred
                }
            }
            
            // Optimization: If no elements were swapped, break early
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original Array: " + Arrays.toString(data));
        
        bubbleSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
