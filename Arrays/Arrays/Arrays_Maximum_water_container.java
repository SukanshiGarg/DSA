package Arrays;
public class Arrays_Maximum_water_container {
public static void main(String[] args) {
    int arr[]={1,8,6,2,5,4,8,3,7};
    //area=length*breadth
    //length=min(lefty,right)
    //breadth=(right-left)
    maxArea(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

public static int maxArea(int height[]){
    int left=0;
    int right=height.length-1;
    int maxArea=0;

    while(left<right){
        int area=Math.min(height[left],height[right])*(right-left);

        maxArea=Math.max(area,maxArea);

        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       
    }
    return maxArea;
}
}