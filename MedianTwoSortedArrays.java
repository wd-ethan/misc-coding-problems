class MedianTwoSortedArrays {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int totalLength = nums1.length + nums2.length;
        int[] nums = new int[totalLength/2+1];
        boolean even = false;
        int j = 0;
        int k = 0;
        
        if(totalLength % 2 == 0) {
            even = true;
        }
        
        int i;
        for (i = 0; i<totalLength/2+1; i++) {
            if (j >= nums1.length) {
                nums[i] = nums2[k++];
            } else if (k >= nums2.length) {
                nums[i] = nums1[j++];
            } else if (nums1[j] < nums2[k]) {
                nums[i] = nums1[j++];
            } else {
                nums[i] = nums2[k++];
            }
        }
        
        if (even) {
            double sum = (nums[i-1] + nums[i-2]);
            return (sum / 2);
        }
        return (nums[i-1]);
    }
}
