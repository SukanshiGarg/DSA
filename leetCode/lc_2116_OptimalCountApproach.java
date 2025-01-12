public class lc_2116_OptimalCountApproach {
    public boolean canBeValid(String s, String locked){
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        //step: overbalanced ')' check
        int opening=0,closing=0,wildcard=0;
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                wildcard++;
            }
            else if(s.charAt(i)=='('){
                opening++;
            }
            else{
                closing++;
            }
            //agar closing jyada hai opening se toh return false
            if(wildcard<(closing-opening)){
                return false;
            }
        }

        opening=closing=wildcard=0;
        for(int i=n-1;i>=0;i--){
            if (locked.charAt(i) == '0') {
                wildcard++;
            } else if (s.charAt(i) == '(') {
                opening++;
            } else {
                closing++;
            }

            //check overbalanced '(' check
            if(wildcard<(opening-closing)){
                return false;
            }
        }
        return true;
    }
    
}
