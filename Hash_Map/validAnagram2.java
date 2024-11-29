package Hash_Map;

import java.util.HashMap;

public class validAnagram2 {
     static HashMap<Character,Integer> makeFreqMap(String str){
         HashMap<Character,Integer> mp=new HashMap<>();
         for(int i=0;i<str.length();i++){
            Character ch= str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currentFreq=mp.get(ch);
                mp.put(ch,currentFreq+1);
            }
         }
         return mp;
     } 
     public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>mp = makeFreqMap(s);
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currFreq=mp.get(ch);
            mp.put(ch,currFreq-1);
        }

        //all the values must be 0 for s and t to be anagrams 
        for(Integer i: mp.values()){
            if(i!=0) return false;
           
        }
        return true;
     }
}
