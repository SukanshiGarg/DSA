import java.util.*;
public class lc_2116 {
    public boolean canBeValid(String s, String locked){
        int n=s.length();
        if(n%2!=0) return false;
        
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> wildcardStack = new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(locked.charAt(i)=='0'){
                wildcardStack.push(i);
            }
            else if(ch=='('){
                openStack.push(i);
            }
            else{
                if(!openStack.isEmpty()){
                    openStack.pop();
                }
                else if(!wildcardStack.isEmpty()){
                    wildcardStack.pop();
                }
                else{
                    return false;
                }
            }
        }

        //match remaining '(' with wildCards
        while(!openStack.isEmpty() && !wildcardStack.isEmpty()){
            if(openStack.peek()<wildcardStack.peek()){
                openStack.pop();
                wildcardStack.pop();
            }
            else{
                break;
            }
        }

        //if any '(' is left unmatched then return false
        return openStack.isEmpty();
    }
}
