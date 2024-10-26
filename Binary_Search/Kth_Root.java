package Binary_Search;

public class Kth_Root {
    public static void main(String[] args) {
        int n = 143;
		int k = 3;
		System.out.println(kthroot(n, k));
    }
    public static int kthroot(int n, int k){
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
}
