class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int mid = l/2;
        return nums[mid];
        
       }
}