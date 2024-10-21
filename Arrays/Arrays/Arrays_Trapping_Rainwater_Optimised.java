package Arrays;

public class Arrays_Trapping_Rainwater_Optimised {
    public static void main(String[] args) {
        int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int result=trap(heights);
        System.out.println(result);
    }
    public static int trap(int height[]){
        int i=0,j=height.length-1,maxLeft=0,maxRight=0,water=0;
        while(i<j){
            if(height[i]<=height[j]){
                //maxLeft
                maxLeft=Math.max(maxLeft,height[i]);
                water+=maxLeft-height[i];
                i++;
            }
            else{
                //maxRight
                maxRight=Math.max(maxRight,height[j]);
                water+=maxRight-height[j];
                j--;
            }
        }
        return water;
    }

    
}
