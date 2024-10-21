package Arrays;

public class Arrays_Product_Of_Arrays_Except_Self {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans[]=productExceptSelf(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] productExceptSelf(int nums[]){
        int n=nums.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int right[]=new int[n];
        right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }

        for(int k=0;k<n;k++){
            nums[k]=right[k]*left[k];
        }
        return nums;

    }
    
}
