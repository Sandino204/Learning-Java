package Java03;

public class Tree {	
	public class TreeNode {
		int data; 
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	TreeNode root;
	
	Tree(){
		root = null;
	}
	
	public TreeNode insert (TreeNode root, int dataToBeInserted) {
		if(root == null) {
			root = new TreeNode(dataToBeInserted);
			return root;
		}
		if(root.data > dataToBeInserted) {
			root.left = insert(root.left, dataToBeInserted);	
		}else if(root.data < dataToBeInserted) {
			root.right = insert(root.right, dataToBeInserted);
		}
		return root;
	}
	
	public TreeNode search(TreeNode root, int dataToBeSearched) {
		if(root == null || root.data == dataToBeSearched) {
			return root;
		}
		if(root.data > dataToBeSearched) {
			return search(root.left, dataToBeSearched);
		}
		
		return search(root.right, dataToBeSearched);
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) 
			return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(TreeNode root) {
		if(root == null)
			return ;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	
	
	
}
