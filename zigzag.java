import java.util.HashMap;
import java.util.Map;

class Zigzag {

    public String convert(String s, int numRows) {
        
        Map<Integer, String> rows = new HashMap<Integer, String>();
        int curRow = 0;
        boolean increasing = true;
        
        for(int i = 0; i < s.length(); i++) {
            
            // this is where map gets updated with each letter
            if(rows.containsKey(curRow)) {
                rows.put(curRow, rows.get(curRow) + s.charAt(i));
            } else {
                rows.put(curRow, "" + s.charAt(i));
            }
            
            // This is where we keep track of which row is next
            if(curRow >= numRows - 1) {
                increasing = false;
            } else if (curRow <= 0) {
                increasing = true;
            }
            
            //This is where row gets incremented
            if (numRows == 1){
            }else if(increasing) {
                curRow++;
            } else {
                curRow--;
            }
            
        }
        
        String zigzag = "";
        for (int j = 0; j <= numRows - 1; j++) {
            if (rows.containsKey(j)) {
                zigzag += rows.get(j);
            }
        }
        return zigzag;
    }
    
}
