//Time complexity : o(N)
package Subarray;

public class Kadanes_Algo_MaxSum_SubArray {
    public static void main(String[] args) {
        int arr[]={2,-2,1,2,3};
        kadaneAlgo(arr);
    }
    public static void kadaneAlgo(int arr[]){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           ans=Math.max(ans,sum);
           if(sum<0){
            sum=0;
           }
        }
        System.out.println(ans);
    }
    
}
