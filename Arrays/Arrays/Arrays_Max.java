package Arrays;
import java.util.*;
public class Arrays_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        sc.close();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(maxElement(arr));
    }

    public static int maxElement(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }
        }
        return max;
    }
    
}
