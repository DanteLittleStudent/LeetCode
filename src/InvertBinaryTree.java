

/*LeetCode-226 Invert Binary Tree
 * ��ת������
 */


//import java.util.LinkedList;
//import java.util.Queue;


//�ݹ�ʵ��
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
	
//�ǵݹ�ʵ��
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

