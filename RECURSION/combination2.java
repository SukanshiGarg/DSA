package RECURSION;
import java.util.*;
public class combination2 {
    public static void main(String[] args) {
        int coin[]={2,3,5};
        int amount=8;
        List<Integer> ll = new ArrayList<>();
        combination(coin,amount, ll ,0);
    }

    public static void combination(int coin[], int amount, List<Integer> ll,int idx){
        if(amount==0){
            System.out.println(ll);
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                ll.add(coin[i]);
                
            }
        }
    }
    
}
