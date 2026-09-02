class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = 2*n;
        int[] res = new int[m];
        int i = 0;
        int j = n;
        int index = 0;
        for(int f = 0;f<n;f++){
            res[index] = nums[i];
            index++;
            res[index] = nums[j];
            index++;
            i++;
            j++;
        }
        return res;
    }
}