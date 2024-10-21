package Arrays;

public class Arrays_Max_Subarray_Sum {
    public static void main(String[] args) {
        int arr[]={-2,1,-4};
        System.out.println(MaxSum(arr));
    }
    public static int MaxSum(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
               sum=sum+arr[j];
               ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    
}
