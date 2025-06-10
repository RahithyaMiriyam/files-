class Solution {
    public boolean isBalanced(TreeNode root) {
          return checkHeight(root) != -1;
    }
    private static int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;
        int heightDiff = leftHeight - rightHeight;
        if (heightDiff < -1 || heightDiff > 1) {
            return -1;
        }
        int height;
        if (leftHeight > rightHeight) {
            height = leftHeight + 1;
        } else {
            height = rightHeight + 1;
        }
        return height;
    }
}