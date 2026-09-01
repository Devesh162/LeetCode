class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for(int i = 1;i<nums.length;i++){
            leftSum[0] = nums[0];
            leftSum[i] = nums[i]+leftSum[i-1]; 
        }
        for(int i = n-2;i>=0;i--){
            rightSum[n-1] = nums[n -1];
            rightSum [i] = nums[i]+rightSum[i+1]; 
        }
        for(int i = 0;i < nums.length; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}