import java.util.*;

public class lc_3042 {
    public boolean isPrefix(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) return false; // Prefix length cannot be greater than the string's length
        for (int i = 0; i < m; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public boolean isSuffix(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) return false; // Suffix length cannot be greater than the string's length
        for (int i = m - 1; i >= 0; i--) {
            if (s1.charAt(i) != s2.charAt(n - (m - i))) return false;
        }
        return true;
    }

    public int countPrefixSuffixPairs(List<String> words) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (isPrefix(words.get(i), words.get(j)) && isSuffix(words.get(i), words.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        lc_3042 solution = new lc_3042();
        List<String> words = Arrays.asList("abc", "ab", "bc", "abc");
        System.out.println(solution.countPrefixSuffixPairs(words)); // Example usage
    }
}
