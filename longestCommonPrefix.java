class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        
        String longest = "";
        
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            longest = longest(strs[0], strs[1]);
        }
        
            
        for (int i = 2; i < strs.length; i++) {
            longest = longest(longest, strs[i]);
        }
        
        return longest;
    }
    
    public String longest(String str1, String str2) {
        
        String str = "";
        int length;
        
        if (str1.length() > str2.length()) {
            length = str2.length();
        } else {
            length = str1.length();
        }
        
        for(int i = 0; i < length; i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                str += "" + str1.charAt(i);
            } else {
                break;
            }
        }
        
        return str;
    }
}
