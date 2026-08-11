class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int result = -1;

        for (int i = 0; i < n; i++) {
            int temp = Math.abs(nums[i]);

            if (nums[temp] < 0) {
                result = temp;
                break;
            } else {
                nums[temp] *= -1;
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1;
            }
        }

        return result;
    }
}