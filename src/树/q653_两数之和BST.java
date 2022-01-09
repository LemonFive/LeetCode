package 树;

import java.util.HashSet;
import java.util.Set;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q653_两数之和BST {
    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {

        traverse(root);

        for (Integer val : set) {
            if (set.contains(k - val) && k - val != val) {
                return true;
            }
        }
        return false;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        } else {
            set.add(node.val);
        }

        traverse(node.left);
        traverse(node.right);
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
