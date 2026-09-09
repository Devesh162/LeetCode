class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> set1 = new HashSet<>();
       for(int n : nums){
        set1.add(n);
       }
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i<= nums.length;i++){
            if(!set1.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}