class Solution {
    public boolean increasingTriplet(int[] nums) {
       int left = Integer.MAX_VALUE;
       int mid = Integer.MAX_VALUE;
       for(int i : nums) {
           if(i <= left) 
            left = i;
           else if(i <= mid) 
            mid = i;
           else 
            return true;
       }
       return false;
    }
}
