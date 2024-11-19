package Random;

public class Linear_Square_Root {
    public static void main(String args[]){
        int n=28;
        int ans=1;
        //time complexity : O(N) 
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }
    
}
