package Binary_Search;

public class Search_In_Sorted_Array {
    public int search(int nums[], int target){
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target) return mid; // If target is at mid, return mid
            
            if(nums[0] <= nums[mid]) { 
                // Left half is sorted
                if(nums[0] <= target && target < nums[mid]){
                    end = mid - 1; // Target is in left half
                } else {
                    start = mid + 1; // Target is in right half
                }
            } else {
                // Right half is sorted
                if(nums[mid] < target && target <= nums[end]){
                    start = mid + 1; // Target is in right half
                } else {
                    end = mid - 1; // Target is in left half
                }
            }
        }
        
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Search_In_Sorted_Array searchInSortedArray = new Search_In_Sorted_Array();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = searchInSortedArray.search(nums, target);
        System.out.println("Index of target is: " + result); // Expected output: Index of target is: 4
    }
}
