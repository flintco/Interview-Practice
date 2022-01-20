// 104. Maximum Depth of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else if (root.left != null && root.right != null){
            return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
        } else if (root.left != null){
            return 1 + maxDepth(root.left);
        } else if (root.right != null){
            return 1 + maxDepth(root.right);
        } else {
            return 1;
        }
    }
        
}

/* 
Description: Given the root of a binary tree, return its maximum depth. A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Step 1 Brute Force: Find all paths. Find the longest one.

Step 2: Recursive algorithm that returns 1 plus the maximum depth of its children node. If has no children, return 1. This will recursively get max depth. Builds from bottom up.

Completed in N/A. Did this while traveling.
*/