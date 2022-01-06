package 树;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q98_验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return recursion(root, null, null);
    }

    private static boolean recursion(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        // 判断当前根结点是否满足要求
        if (min != null && root.val >= min) {
            return false;
        }
        if (max != null && root.val <= max) {
            return false;
        }

        // 判断当前结点的左右子树是否满足要求
        return recursion(root.left, root.val, max) && recursion(root.right, min, root.val);
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
