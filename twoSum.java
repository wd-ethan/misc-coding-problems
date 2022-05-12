import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if(hash.get(target - nums[i]) != null) {
                return new int[] {i, hash.get(target - nums[i])};
            } else {
                hash.put(nums[i], i);
            }
            
        }
        return new int[] {-1, -1};
    }
}
