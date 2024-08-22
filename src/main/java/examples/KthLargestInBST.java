package examples;

public class KthLargestInBST {

    private static int count = 0;
    private static int result = -1;

    public static int kthLargest(TreeNode root, int k) {
        count = 0;
        result = -1;
        reverseInOrder(root, k);
        return result;
    }

    private static void reverseInOrder(TreeNode node, int k) {
        if (node == null || count >= k) {
            return;
        }

        reverseInOrder(node.right, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        reverseInOrder(node.left, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(55);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        int k = 3;
        System.out.println("The " + k + "th largest element is " + kthLargest(root, k));
    }
}
