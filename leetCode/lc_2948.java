//tc:O(n3)
//sc:O(1)
public class lc_2948 {
    public int[] lexographicallySmallestArray(int nums[], int limit){
        int n=nums.length; //length of the array

        for(int i=0;i<nums.length;i++){

            while(true){
                int smallValue=nums[0]; //first index se start karenge
                int idx=-1; 

                for(int j=i+1;j<n;j++){
                    if(Math.abs(nums[i]-nums[j]) <= limit ){
                        if(nums[j]<smallValue){
                            smallValue=nums[j];
                            idx=j;
                        }
                    }
                }
                
                if(idx!=-1){
                    //if idx if not -1 then an element smalller is found in the array
                    //swap the smaller value
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                }
                else{
                    break;
                }
            }
        }
        return nums;
    }
    
}
