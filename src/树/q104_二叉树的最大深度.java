package 树;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q104_二叉树的最大深度 {
    private int maxLevel = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return maxLevel;
        }

        levelOrder(root, 1);

        return maxLevel;
    }

    public void levelOrder(TreeNode root, int level) {
        maxLevel = level > maxLevel ? level : maxLevel;

        if (root.left != null) {
            levelOrder(root.left, level + 1);
        }

        if (root.right != null) {
            levelOrder(root.right, level + 1);
        }
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
