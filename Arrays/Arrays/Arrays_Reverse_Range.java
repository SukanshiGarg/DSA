package Arrays;
public class Arrays_Reverse_Range {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int si=1;
    int ei=5;
    reverseInRange(arr,si,ei);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }

  

  public static void reverseInRange(int arr[],int si,int ei){
    int i=si;
    int j=ei;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        i++;
        j--;
    }
    
  }
}

    

