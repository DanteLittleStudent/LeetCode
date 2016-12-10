

/*LeetCode-104 Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 *The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */


public class MaximumDepthOfBinaryTree {

	
	public int maximumDepthOfBinaryTree(TreeNode root){
		if(root == null){
			return 0;
		}else{
			int leftDepth = maximumDepthOfBinaryTree(root.left);
			System.out.println("left:"+leftDepth);
			if(root.left != null){
				System.out.println("leftValue = " + root.left.val);
			}
			int rightDepth = maximumDepthOfBinaryTree(root.right);
			System.out.println("right:"+rightDepth);
			if(root.right != null){
				System.out.println("rightValue = " + root.right.val);
			}
			return (leftDepth < rightDepth)?(rightDepth + 1):(leftDepth + 1);
		}
	}
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}
