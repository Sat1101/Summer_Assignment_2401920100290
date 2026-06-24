class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (m.contains(nums[i])){
                return true;
            }
            else {
                m.add(nums[i]);
            }
        }
     return false;
    }
}
