package Hash_Map;
import java.util.HashMap;
public class validAnagram3 {
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer>mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch= str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);


        }
        return mp;
    }  
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp = makeFreqMap(s);
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }
            int currFreq=mp.get(ch);
            if(currFreq ==1){
                mp.remove(ch);
            }
            else{
                mp.put(ch,currFreq-1);
            }

        }
        return mp.isEmpty();

    }
    
}
