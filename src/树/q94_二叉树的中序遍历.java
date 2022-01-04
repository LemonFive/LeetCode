package 树;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q94_二叉树的中序遍历 {
    private List<Integer> resultList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return resultList;
        }

        inorderTraversal(root.left);
        resultList.add(root.val);
        inorderTraversal(root.right);

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
