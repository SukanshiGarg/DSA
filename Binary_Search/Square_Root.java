package Binary_Search;
import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Square_Root ob = new Square_Root();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = ob.mySqrt(n);
        System.out.println(result);
    }

    public int mySqrt(int x) {
        if (x == 0) return 0; // Special case for x = 0
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mid * mid;
            if (val == x) {
                return mid;
            } else if (val < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
