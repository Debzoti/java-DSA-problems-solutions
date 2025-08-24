package arshGoyalSheet.Rercursion;

public class BinaryTreeHeight {
    public int maxDepth(TreeNode root) {
        //base condition
        if (root == null) {
            return 0;
        }

        //hypothesis
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        
        //induction
        return 1 + Math.max(lh, rh);
    }

        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

}
