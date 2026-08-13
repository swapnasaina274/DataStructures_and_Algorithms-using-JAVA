import java.util.Scanner;

class BinarySearch {

    int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid; 
            }
            else if (key > arr[mid]) {
                low = mid + 1; // Search right half
            }
            else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Key not found in array
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78};
        int key = 67;

        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in array.");
        }
    }
}