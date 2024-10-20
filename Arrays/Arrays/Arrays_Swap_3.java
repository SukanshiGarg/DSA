package Arrays;

public class Arrays_Swap_3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int other[]={6,7,8,9,10};
        System.out.println(arr[0]+" "+other[0]);
        swap(arr,other);
        System.out.println(arr[0]+" "+other[0]);
    }
    public static void swap(int arr[],int other[]){
        int temp[]=arr;
        arr=other;
        other=temp;
    }
}
