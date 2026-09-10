class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        for(int j = 0;j<k;j++){
            sum = sum+nums[j];
        }
        int maxSum = sum;
        int i = 0;
        int j = k;
        while(j<nums.length){
            sum += nums[j];
            sum -= nums[i];
            maxSum = Math.max(sum , maxSum);
            i++;
            j++;
        }
        return (double) maxSum/k;
    }
}