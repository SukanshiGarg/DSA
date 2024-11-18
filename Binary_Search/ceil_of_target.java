package Binary_Search;

public class ceil_of_target {
    public static int findCeil(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        if (x > arr[high]) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int find_floor(int arr[], int n, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        if (x < arr[0]) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        int x = 5;
        System.out.println("Ceil of " + x + " is: " + findCeil(arr, n, x));
        System.out.println("Floor of " + x + " is: " + find_floor(arr, n, x));
    }
}
