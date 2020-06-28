package test;

import java.util.Stack;

//         1
//     2       3
// 4     5  6     7
//8  9 10 1112 1314 15

public class BinaryTreeN {

	static TreeNode popuplateBinaryTree(){
		TreeNode root = new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		root.left.left.left=new TreeNode(8);
		root.left.left.right=new TreeNode(9);
		root.left.right.left=new TreeNode(10);
		root.left.right.right=new TreeNode(11);
		root.right.left.left=new TreeNode(12);
		root.right.left.right=new TreeNode(13);
		root.right.right.left=new TreeNode(14);
		root.right.right.right=new TreeNode(15);
		return root;

	}

	static void levelOrderSpiralTrav(TreeNode root) {

		Stack s1 = new Stack();
		Stack s2 = new Stack();
		boolean rev=false;
		s1.push(root);

		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				TreeNode ele = (TreeNode) s1.pop();
				System.out.print(ele.data+" ");
				if(ele.left != null) {
					s2.push(ele.left);
				}
				if(ele.right != null) {
					s2.push(ele.right);

				}

			}
			while(!s2.isEmpty()) {
				TreeNode ele = (TreeNode) s2.pop();
				System.out.print(ele.data+" ");
				if(ele.right != null) {
					s1.push(ele.right);
				}
				if(ele.left != null) {
					s1.push(ele.left);
				}

			}

		}	


	}

	public static void main(String[] args) {

		TreeNode bt = popuplateBinaryTree(); 
		levelOrderSpiralTrav(bt);

	}



}
