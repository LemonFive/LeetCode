package 树;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q145_二叉树的后序遍历 {
    private List<Integer> resultList = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return resultList;
        }

        postorderTraversal(root.right);
        resultList.add(root.val);
        postorderTraversal(root.left);

        return resultList;
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
