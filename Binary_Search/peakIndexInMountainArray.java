package Binary_Search;

public class peakIndexInMountainArray {
    public int peakIndexInMountainArray(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            //find out the middle element 
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else {
                e=mid;
            }
        }
        //at the end of the loop , if s==e and it represents the peak index 
        return s;
    }
    
}
