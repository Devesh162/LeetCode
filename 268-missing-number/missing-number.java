class Solution {
    public int missingNumber(int[] nums) {
       //By Xor 
       int n = nums.length;
       int xorSum = 0;
       for(int l : nums){
            xorSum ^= l;
       } 
       for(int i = 0; i<=n;i++){
            xorSum =xorSum^i;
       }
       return xorSum;
    }
}