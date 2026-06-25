/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int ans[] = new int[1];
        ans[0] = Integer.MIN_VALUE;
        mp(root,ans);
        return ans[0];
    }
        public int mp(TreeNode root, int[] ans) {
        if(root == null) {
            return 0;
        }
        int ls = Math.max(0, mp(root.left, ans));
        int rs = Math.max(0, mp(root.right,ans));
            ans[0] = Math.max(ans[0],root.val+ls+rs);
            return root.val+Math.max(ls,rs);
    }
}
