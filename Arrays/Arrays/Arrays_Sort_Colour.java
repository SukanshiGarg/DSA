package Arrays;

public class Arrays_Sort_Colour {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2};
        sortColour(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sortColour(int arr[]){
        int n=arr.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                  c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int j=c0;j<c0+c1;j++){
            arr[j]=1;
        }
        for(int k=c1+c0;k<arr.length;k++){
            arr[k]=2;
        }
    }
    
}
