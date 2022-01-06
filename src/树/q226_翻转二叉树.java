package 树;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q226_翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
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
