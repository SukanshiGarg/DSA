package Hash_Map;
import java.util.HashMap;
public class SingleNumber {
    public static int single_HashMap(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            else{
                int currFreq=map.get(num);
                map.put(num,currFreq+1);
            }
        }
        for(int num:nums){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }

    public static int single_HashSet(int nums[]){
        
    }
    
}
