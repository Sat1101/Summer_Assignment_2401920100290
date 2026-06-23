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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            TreeNode cn = q.remove();
            if(cn == null) {
                ans.add(list);
                list = new ArrayList<>();
                if(!q.isEmpty()) {
                    q.add(null);
                }else{
                    break;
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
