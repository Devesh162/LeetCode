class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int num : nums){
            res.put(num, res.getOrDefault(num, 0) +1);
        }
        for(int i : nums){
            if(res.get(i) > 1){
            return true;
            }
        }
        return false;
    }
}