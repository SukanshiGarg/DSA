package Arrays;

public class Arrays_Swap_1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0]+" "+arr[1]);

    }
    public static void swap(int a, int b){
      int temp=a;
      a=b;
      b=temp;
    }
}
