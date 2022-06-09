import java.util.Hashtable;

class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
    
        Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
        int i;
        // first character in no-repeat string
        int j = 0;
        int saved = 1;
        
        if (s.length() == 0){
            return 0;
        }
        
        for (i = 0; i < s.length(); i++) {
            
            //this is essentially a fail, we have seen this character before
            if (hash.get(s.charAt(i)) != null && hash.get(s.charAt(i)) >= j){
                //save our count
                if ((i-j) > saved){
                    saved  = (i-j);
                }
                j = hash.get(s.charAt(i))+1;
                hash.put(s.charAt(i), i);
                
            // else we continue on
            } else{
                hash.put(s.charAt(i), i);
            }
        }
        if ((i-j) > saved){
            saved  = (i-j);
        }
        return saved;
    }
}
