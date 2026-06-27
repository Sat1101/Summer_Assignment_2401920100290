/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "N";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                sb.append("N,");
            } else {
                sb.append(node.val).append(",");
                q.offer(node.left);
                q.offer(node.right);
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        if (vals[0].equals("N"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int index = 1;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (!vals[index].equals("N")) {
                node.left = new TreeNode(Integer.parseInt(vals[index]));
                q.offer(node.left);
            }
            index++;

            if (!vals[index].equals("N")) {
                node.right = new TreeNode(Integer.parseInt(vals[index]));
                q.offer(node.right);
            }
            index++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
