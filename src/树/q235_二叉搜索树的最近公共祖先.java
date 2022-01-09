package 树;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q235_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return searchAncestor(root, p, q);
    }

    public TreeNode searchAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val)
            return searchAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val)
            return searchAncestor(root.right, p, q);

        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
