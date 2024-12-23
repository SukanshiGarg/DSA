package Arrays;

public class Arrays_Trapping_Rainwater {
    public static void main(String[] args) {
        int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int result=max(heights);
        System.out.println(result);
    }

    public static int max(int heights[]){
        if(heights== null || heights.length ==0 ){
            return 0;
        }

        //BRUTE FORCE : 
        //HAR EK POINT PR USKE LEFT AUR RIGHT SIDE MAXIMUM NIKALO 
        //UN DONO KA MINIMUM NIKAL AUR CURRENT VALUE KE SUBSTRACT KARLO

        int n=heights.length;
        int [] leftMax=new int[n];
        int []rightMax=new int[n];

        leftMax[0]=heights[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],heights[i]);
        }

        rightMax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],heights[i]);
        }
        
        int waterTrapped=0;
        for(int i=0;i<n;i++){
            waterTrapped+=Math.min(leftMax[i],rightMax[i])-heights[i];
        }
        return waterTrapped;
        
    }
    
}
