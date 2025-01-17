package RECURSION;
import java.util.*;

public class combination_sum {
    public static void main(String[] args) {
        int[] coin = {2, 3, 5};
        int amt = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin, amt, ll, 0, ans);
        System.out.println(ans);
    }

    public static void Combination(int[] coin, int amt, List<Integer> ll, int idx, List<List<Integer>> ans) {
        // Base case:
        if (amt == 0) {
            ans.add(new ArrayList<>(ll)); // Add a copy of the current combination
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if (amt >= coin[i]) {
                ll.add(coin[i]); // Choose the coin
                Combination(coin, amt - coin[i], ll, i, ans); // Stay at the same index for unlimited coins
                ll.remove(ll.size() - 1); // Backtrack
            }
        }
    }
}
