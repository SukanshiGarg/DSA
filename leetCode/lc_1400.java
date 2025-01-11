import java.util.HashMap;
import java.util.Map;

public class lc_1400 {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) oddCount++;
            if (oddCount > k) return false; // Early exit
        }

        return oddCount <= k;
    }

    public static void main(String[] args) {
        lc_1400 solution = new lc_1400();

        // Test cases
        String s1 = "annabelle";
        int k1 = 2;
        System.out.println(solution.canConstruct(s1, k1)); // Output: true

        String s2 = "leetcode";
        int k2 = 3;
        System.out.println(solution.canConstruct(s2, k2)); // Output: false

        String s3 = "true";
        int k3 = 4;
        System.out.println(solution.canConstruct(s3, k3)); // Output: true

        String s4 = "aabbcc";
        int k4 = 3;
        System.out.println(solution.canConstruct(s4, k4)); // Output: true

        String s5 = "abc";
        int k5 = 4;
        System.out.println(solution.canConstruct(s5, k5)); // Output: false
    }
}
