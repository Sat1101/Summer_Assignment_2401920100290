class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
       int[] result = new int[n];      
       int i = 0;
       int j = nums.length-1;
       int p = nums.length-1;
       while(i <= j) {
         if(Math.abs(nums[i]) > Math.abs(nums[j])) {
             result[p] = nums[i] * nums[i];
             i++;
         }else{
            result[p] = nums[j] * nums[j];
            j--;
         }
         p--;
       } 
       return result;   
    }
}
