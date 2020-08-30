/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode ans=null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return false;
        boolean inCurrentNode = root==p||root==q;
        boolean inLeft = dfs(root.left,p,q);
        boolean inRight = dfs(root.right,p,q);
        if((inLeft&&inRight)||(inCurrentNode&&(inLeft||inRight))) {
            ans = root;
        }
        return inRight||inLeft||inCurrentNode;
    }
}
