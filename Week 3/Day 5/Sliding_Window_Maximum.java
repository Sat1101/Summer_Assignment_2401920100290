class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && q.peekLast() < nums[i]) {
                q.pollLast();
            }
            q.addLast(nums[i]);
        }
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int s = k;
        int f = 0;
        while (s < n) {
            ans[f] = q.peekFirst();
            if (q.peekFirst() == nums[f]) {
                q.pollFirst();
            }
            while (!q.isEmpty() && q.peekLast() < nums[s]) {
                q.pollLast();
            }
            q.addLast(nums[s]);
            f++;
            s++;
        }
        ans[f] = q.peekFirst();
        return ans;
    }
}
