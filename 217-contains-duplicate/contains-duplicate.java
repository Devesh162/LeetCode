class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer> res = new HashMap<>();
        // for(int num : nums){
        //     res.put(num, res.getOrDefault(num, 0) +1);
        // }
        // for(int i : nums){
        //     if(res.get(i) > 1){
        //     return true;
        //     }
        // }
        // return false;
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = i+1;
        while(j<n){
            if(nums[i] == nums[j]){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}