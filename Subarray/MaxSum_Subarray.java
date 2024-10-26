//This basic approach generate TLE 
package Subarray;

public class MaxSum_Subarray {
    public static void main(String args[]){
        int arr[]={2,-2,1,2,3};
        maxSum(arr);
    }
    public static void maxSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }
    
}
