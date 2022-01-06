package 树;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q102_二叉树的层序遍历 {
    List<List<Integer>> resultList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return resultList;
        }

        // 添加首个节点数据
        levelOrder(root, 0);

        return resultList;
    }

    public void levelOrder(TreeNode root, int level) {
        if (resultList.size() <= level) {
            resultList.add(new ArrayList<Integer>());
        }

        resultList.get(level).add(root.val);

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
