package hashSet;

import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfArrays {
    public int[] intersection(int []num1, int num2[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n: num1){
            map.put(n,1);
        }

        ArrayList<Integer> ans=new ArrayList<>();

        for(int n: num2){
            if(map.containsKey(n) && map.get(n)==1){
                map.put(n,0);
                ans.add(n);
            }
        }

        int res[]= new int[ans.size()];
      
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;

    }
    
}
