class LongestPalindrome {

    public String longestPalindrome(String s) {
        
        if (s.length() < 2) {
            return s;
        }
        
        int i = 0, j = 0;
        
        for (int c = 0; c < s.length(); c++) {
            
            int odd = expand(s, c, c);
            int even = expand(s, c, c+1);
            int length = Math.max(odd, even);
            
            if (length > (j-i)) {
                i = c - (length-1)/2;
                j = c + length/2;
            }
        }
        
        return s.substring(i, j+1);
    }
    
    public int expand(String s, int l, int r) {
        
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
        
    }
}
