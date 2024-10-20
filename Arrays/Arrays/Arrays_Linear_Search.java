package Arrays;

public class Arrays_Linear_Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int search=4;
        System.err.println(linearSearch(arr,search));
    }
    public static int linearSearch(int arr[],int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return arr[i];
            }
        }
        return -1;
    }

    
}
