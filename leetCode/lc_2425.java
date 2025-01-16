import java.util.*;

public class lc_2425 {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;
        
        if (nums2.length % 2 != 0) {
            for (int num : nums1) {
                xor1 ^= num;
            }
        }
        
        if (nums1.length % 2 != 0) {
            for (int num : nums2) {
                xor2 ^= num;
            }
        }
        
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        int[] nums1 = {2, 1, 3};
        int[] nums2 = {10, 2, 5, 0};
        System.out.println("Output for Test Case 1: " + solution.xorAllNums(nums1, nums2)); // Output: 13

        // Test Case 2
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Output for Test Case 2: " + solution.xorAllNums(nums1_2, nums2_2)); // Output: 0

        // Test Case 3
        int[] nums1_3 = {0};
        int[] nums2_3 = {0};
        System.out.println("Output for Test Case 3: " + solution.xorAllNums(nums1_3, nums2_3)); // Output: 0

        // Test Case 4
        int[] nums1_4 = {5, 6, 7};
        int[] nums2_4 = {1, 2};
        System.out.println("Output for Test Case 4: " + solution.xorAllNums(nums1_4, nums2_4)); // Output: 0
    }
}
