package Hash_Map;
import java.util.HashMap;
public class isomorphic2 {
    boolean isIsomorphic(String s, String t){
        //check krlo ki dono ki length toh same hai na
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);
            
            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }
                else{
                    return false;
                }
            }

            else{
                char mapped=map.get(original);
                if(mapped!=replacement){
                    return false;
                }
            }
        }
        return true;
        
    }
    
}
