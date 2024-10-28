package Arrays;

import java.util.HashSet;
public class Arrays_findSumOfTwoEqualsThird {
    public static boolean solution(int arr[]){
        HashSet<Integer> set= new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                //check if the sum exists in the set and is not arr[i] and arr[j]
                if(set.contains(sum) && sum!=arr[i] && sum!=arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(solution(arr));
    }
    
}
