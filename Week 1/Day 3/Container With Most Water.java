class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(i < j) {
            int ht = Math.min(height[i], height[j]);
            int wd = j - i;
            int area = ht * wd;
            maxArea = Math.max(maxArea, area);
            if(height[i] < height[j]) {
                i++;
            }else if(height[i] > height[j]) {
                j--;
            }else{
                i++;
                j--;
            }
        }
        return maxArea;
    }
}
