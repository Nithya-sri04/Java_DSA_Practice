import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class BinaryTreeRightView {
    
    public List<Integer> rightView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }  
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();          
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (i == levelSize - 1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        BinaryTreeRightView tree = new BinaryTreeRightView();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        
        List<Integer> rightView = tree.rightView(root);
        System.out.println("Right view of the binary tree: " + rightView);
    }
}

