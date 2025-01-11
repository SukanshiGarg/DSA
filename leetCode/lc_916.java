import java.util.ArrayList;
import java.util.List;

public class lc_916 {
    public List<String> wordSubsets(String words1[], String[] words2) {
        int[] maxfreq = new int[26];
        for (String word : words2) { 
            int temp[] = getFreq(word); 
            for (int i = 0; i < 26; i++) {
                maxfreq[i] = Math.max(maxfreq[i], temp[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (String word : words1) { 
            int temp[] = getFreq(word); 
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (maxfreq[i] > temp[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.add(word);
            }
        }
        return res;
    }

    public int[] getFreq(String word) {
        int freq[] = new int[26];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        lc_916 solution = new lc_916();
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        List<String> result = solution.wordSubsets(words1, words2);
        System.out.println(result); // Output: [facebook, google, leetcode]

        String[] words1_2 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2_2 = {"l", "e"};
        List<String> result2 = solution.wordSubsets(words1_2, words2_2);
        System.out.println(result2); // Output: [apple, google, leetcode]
    }
}
