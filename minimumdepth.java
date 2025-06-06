class Solution {
    public int minDepth(TreeNode root) {
         if(root==null){
            return 0;
        }
        if(root.left==null || root.right==null){
            return 1+(root.left==null ? minDepth(root.right) : minDepth(root.left));
        }
        int leftDepth=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        return 1+ (leftDepth < rightDepth ? leftDepth : rightDepth);
    }
} 