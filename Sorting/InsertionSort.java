package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,2};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void insertAtLast(int arr[],int i){
       int item=arr[i];  //jo element galat hai woh
       int j=i-1; //ek previous wale element ko yaad kar lenge
       while(j>0 && arr[j]>item){
        arr[j+1]=arr[j];
        j--;
       }
       arr[j+1]=item;
    }

    public  static void Sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            insertAtLast(arr, i);
        }
    }
    
    
    
}
