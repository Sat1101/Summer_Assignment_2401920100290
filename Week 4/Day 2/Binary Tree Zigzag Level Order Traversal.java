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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean flip = false;
        while(!q.isEmpty()) {
            TreeNode cn = q.remove();
            if(cn == null) {
                if(flip) {
                    Collections.reverse(list);
                }
                ans.add(list);
                flip = !flip;
                if(q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                    list = new ArrayList<>();
                }
            }else{
                list.add(cn.val);
                if(cn.left != null) {
                    q.add(cn.left);
                }
                if(cn.right != null) {
                    q.add(cn.right);
                }
            }
        }
        return ans;
    }
}
