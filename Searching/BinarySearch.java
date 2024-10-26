package Searching;
//binary search happens only on sorted arrays 
//binary search is always applied on sorted search space.
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        System.out.println(binary(arr, target));
    }

    public static int binary(int arr[], int t) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid inside the loop
            if (t == arr[mid]) {
                return mid;
            } else if (t < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Target not found
    }
}
