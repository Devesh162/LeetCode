class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int slow = 0;
        int fast;
        for(fast = 0; fast < l;fast++){
            if(slow <2 || nums[fast] != nums[slow -2]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}