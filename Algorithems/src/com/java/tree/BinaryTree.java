package com.java.tree;


public class BinaryTree {

	/*
	 * Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures
	 * One reason to use trees might be because you want to store information that naturally forms a hierarchy
	 * The maximum number of nodes at level ‘l’ of a binary tree is 2l-1.
	 * Full Binary Tree A Binary Tree is full if every node has 0 or 2 children. Following are examples of full binary tree.
	 * In a Full Binary, number of leaf nodes is number of internal nodes plus 1
	 * Complete Binary Tree: A Binary Tree is complete Binary Tree if all levels are completely filled except possibly the last 
	 * level and the last level has all keys as left as possible
	 * Perfect Binary Tree A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves 
	 * are at same level.
	 * Total number of edges in Tree is number of nodes minus 1
	 * Application of tree:
	 * 1.	Manipulate hierarchical data.
		2.	Make information easy to search (see tree traversal).
		3.	Manipulate sorted lists of data.
		4.	As a workflow for compositing digital images for visual effects.
		5.	Router algorithms
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeImplimentation bTree = new BinaryTreeImplimentation(1);
		bTree.root.left = new Node(2);
		bTree.root.right = new Node(3);
	}

}

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int d){
		this.data = d;
		this.left = this.right = null;
	}
}

class BinaryTreeImplimentation{
	Node root;
	
	BinaryTreeImplimentation(){
		root = null;
	}
	
	BinaryTreeImplimentation(int data){
		root = new Node(data);
	}
}