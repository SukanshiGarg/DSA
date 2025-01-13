import java.util.*;
public class lc_3223 {
    public static int minLength(String s){
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        
        //Step1: Count the frequency of each chaacter
        for(char ch: s.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }
        
        

    }
    
}
