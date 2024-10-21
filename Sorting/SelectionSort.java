/*
 in selection sorting : we select a element from the starting and then from next element till the ending
 we select the minimumm number from the range and swap it from the original element selected

 --rough idea
 for(int i=0;i<arr.length;i++){
     int min=i;
     for(int j=i+1;j<arr.length;j++)
     {
        if(arr[j]<arr[min]){
           min=j;
        }
     }
        //swap
        int temp=arr[mini]
        arr[mini]=arr[i]
        arr[i]=temp
   }
 */
package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,5,3,2,1};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int minIndx(int arr[],int i){
        int mini=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
    
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int indx=minIndx(arr, i);
            //now swapping karloooo
            int temp=arr[i];
            arr[i]=arr[indx];
            arr[indx]=temp;
        }
    }
    
}
