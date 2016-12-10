

/*LeetCode-226 Invert Binary Tree
 * 反转二叉树
 */


//import java.util.LinkedList;
//import java.util.Queue;


//递归实现
public class InvertBinaryTree {
	public TreeNode invertBinaryTree(TreeNode node){
		if(node != null){
			TreeNode temp = node.left;
			node.left = this.invertBinaryTree(node.right);
			node.right = this.invertBinaryTree(temp);
			return node;
		}
		return node;
	}
	
//非递归实现
//	public TreeNode invertBinaryTree(TreeNode node){
//		if(node == null){
//			return node;
//		}
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//		queue.add(node);
//		if(queue != null){
//			TreeNode current = queue.poll();
//			TreeNode temp = current.left;
//			current.left = current.right;
//			current.right = temp;
//			if(current.left != null){
//				queue.add(current.left);
//			}
//			if(current.right != null){
//				queue.add(current.right);
//			}
//		}
//		return node;
//	}
}

