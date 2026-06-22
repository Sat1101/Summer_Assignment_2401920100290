class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> s = new Stack<>();
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        //next smallest right
        for(int i=heights.length-1; i>=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
            }

            //next smallest left
            Stack<Integer> s2 = new Stack<>();
            for(int i=0; i<heights.length; i++) {
            while(!s2.isEmpty() && heights[s2.peek()] >= heights[i]) {
                s2.pop();
            }
            if(s2.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s2.peek();
            }
            s2.push(i);
            }

            int maxArea = 0;
            for(int i=0; i<heights.length; i++) {
                int ht = heights[i];
                int wd = nsr[i] - nsl[i] - 1;
                int currArea = ht*wd;
                maxArea = Math.max(currArea, maxArea);
            }
            return maxArea;
    }
}
