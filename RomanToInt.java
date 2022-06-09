class Roman2Int {
    
    public int romanToInt(String s) {
        char[] charArr = s.toCharArray();
        int i;
        int sum = 0;
        // check each element in char array
        for (i = 0; i < s.length()-1; i++){
            // this is our "weird" case
            if (getValue(charArr[i]) < getValue(charArr[i+1])) {
                sum += (getValue(charArr[i+1]) - getValue(charArr[i]));
                i++;
            } else {
                sum += getValue(charArr[i]);
            }
        }
        // off by one probelm..
        if (i < s.length()) {
            sum += getValue(charArr[i]);
        }
        
        return sum;
    }
    
    // easy switch case, cleans code above
    public int getValue(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        } 
    }
}
