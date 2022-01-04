package 树;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q144_二叉树的前序遍历 {
    private List<Integer> resultList = new ArrayList();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return resultList;
        }

        resultList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

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
