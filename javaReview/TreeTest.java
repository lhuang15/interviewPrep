package TreeLab;
import TreeTutorial.*;
class TreeTest {
	public static void main(String[] args) {    
        Tree newTree = new Tree();
        newTree.root.data = 1;
        newTree.root.left = new TreeNode();
        newTree.root.left.data = 0;
        newTree.root.right = new TreeNode();
        newTree.root.right.data = 2;

        newTree.inOrderTraversal(newTree.root);

        System.out.println("OK "); // Display the result.
    }

}