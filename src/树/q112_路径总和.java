package 树;

import java.util.HashSet;
import java.util.Set;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q112_路径总和 {
    Set<Integer> result = new HashSet<>();

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        doSum(root, 0);
        return !result.add(targetSum);
    }

    private void doSum(TreeNode root, int sum) {
        sum = sum + root.val;

        if (root.left == null && root.right == null) {
            result.add(sum);
        }

        if (root.left != null) {
            doSum(root.left, sum);
        }

        if (root.right != null) {
            doSum(root.right, sum);
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
