package Arrays;
public class Arrays_Rotate_Array_K_Places{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int k=3;
        rotateArray(arr,k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateArray(int arr[],int k){
        int n=arr.length;
        k=k%n;
        if(k==0) return; // no rotation needed if k=0

        reverse(arr,0,n-1);  //reverse the entire array
        reverse(arr,0,k-1);  // reverse the first k elements  
        reverse(arr,k,n-1);  // reverse the remaining elements
    }

    public static void reverse(int arr[], int i , int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
}