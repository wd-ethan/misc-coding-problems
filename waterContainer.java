class WaterContainer {
    
    public int maxArea(int[] height) {
        
        //start with widest container
        
        // pointers
        int i = 0, j = height.length-1;
        // keep track of max
        int maxArea = calcArea(height, i, j);
        
        
        while (i < j) {
            
            // the idea here is to move the limiting one...
            if (i == minHeight(height, i , j)) {
                 i++;
            } else {
                j--;
            }
            
            // now check if that optimized
            if (maxArea < calcArea(height, i, j)) {
                maxArea = calcArea(height, i, j);
            }
        }
        
        return maxArea;
        
    }
    
    
    // return min height for purpose of calculating area
    public int minHeight(int[] height, int i, int j) {
        if (height[i] > height[j]) {
            return j;
        }
        return i;
    }
    
    // simple calculation of area for this specfic problem
    public int calcArea(int[] height, int i, int j) {
        return (j-i)*(Math.min(height[i], height[j]));
    }
    
}
