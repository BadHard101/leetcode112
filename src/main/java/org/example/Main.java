package org.example;

public class Main {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return (targetSum - root.val == 0 && root.left == null && root.right == null) ||
                (root.left != null && hasPathSum(root.left, targetSum - root.val)) ||
                (root.right != null && hasPathSum(root.right, targetSum - root.val));
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}