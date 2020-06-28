package test;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
		left=right=null;
	}

}


public class Tree {
	TreeNode root;

	Tree(int data){
		
		root=new TreeNode(data);

	}
	


	Tree(){
		root=null;
	}
	
	

}
