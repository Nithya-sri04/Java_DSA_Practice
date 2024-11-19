import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class MaxHeight {
    
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
        }
    }

     public static void main(String[] args) {
        MaxHeight tree = new MaxHeight();
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        
        int result  = tree.maxDepth(root);
        System.out.println("Height of the binary tree: " + result);
    }
}
