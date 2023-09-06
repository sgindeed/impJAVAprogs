class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int number=1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0 && number==nums[i])
                number++;
        }
        return number;
    }
}
