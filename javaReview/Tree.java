package TreeTutorial;
public class Tree {
    public class TreeNode {
    	public int data;
    	public TreeNode left;
    	public TreeNode right;
    	public TreeNode (){
    		this.data = 999;
    	}
    }

    public TreeNode root;

    /*	In-order traversal means to visit the left 
    	branch, then the current node, and finally, 
    	the right branch.
    	When performed on a binary search tree, it
    	visits the nodes in ascending order.	*/
    public void inOrderTraversal(TreeNode node) {
    	if (node != null) {
    		inOrderTraversal(node.left);
    		System.out.println(node.data);
    		inOrderTraversal(node.right);
    	}
    }

    /*	Pre-order traversal visits the current
    	node before its child nodes.			*/
    public void preOrderTraversal(TreeNode node) {
    	if (node != null) {
    		System.out.println(node.data);
    		preOrderTraversal(node.left);
    		preOrderTraversal(node.right);
    	}
    }

    /*	Post-order traversal visits the current
    	node after its child nodes.				*/
    public void postOrderTraversal(TreeNode node) {
    	if (node != null) {
    		postOrderTraversal(node.left);
    		postOrderTraversal(node.right);
    		System.out.println(node.data);
    	}
    }
}