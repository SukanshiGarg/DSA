package RECURSION;

public class dice {
    public static void main(String[] args) {
        int n=4;
        printans(n,0,"");
    }

    public static void printans(int n, int curr, String ans){
        if(curr == n ) {
            System.out.println(ans+" ");
            return;
        }
        if(curr>n){
            return;
        }
        for(int dice=1;dice<=3;dice++){
            printans(n, curr+dice, ans+dice);
        }
    }
    


    
}
