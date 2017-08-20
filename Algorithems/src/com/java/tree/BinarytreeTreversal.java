package com.java.tree;


public class BinarytreeTreversal {

	/*
	 * Depth First Traversals:
		(a) Inorder (Left, Root, Right) : 4 2 5 1 3
		(b) Preorder (Root, Left, Right) : 1 2 4 5 3
		(c) Postorder (Left, Right, Root) : 4 5 2 3 1
	 */
	public static void main(String[] args) 
	{
		BinaryTreeImplimentation1 bTree = new BinaryTreeImplimentation1(1);
		bTree.root.left = new Node1(2);
		bTree.root.right = new Node1(3);
		bTree.root.left.left = new Node1(4);
		bTree.root.left.right = new Node1(5);
		System.out.print("Inorder: ");
		bTree.printInorderTree(bTree.root); // 4 2 5 1 3 
		System.out.println();
		System.out.print("Preorder: ");
		bTree.printPreorderTree(bTree.root); // 1 2 4 5 3 
		System.out.println();
		System.out.print("Postorder: ");
		bTree.printPostorderTree(bTree.root); // 4 5 2 3 1
		System.out.println();
		System.out.print("BFS: ");
		bTree.printBFSTree(bTree.root); // 1 2 3 4 5 
		
	}
}

class Node1{
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int d){
		this.data = d;
		this.left = this.right = null;
	}
}

class BinaryTreeImplimentation1{
	Node1 root;
	
	BinaryTreeImplimentation1(){
		root = null;
	}
	boolean temp = false;
	
	public void printBFSTree(Node1 node){
		System.out.print(node.data+" ");
		printBFSTreeRecur(node);
	}
	
	public void printBFSTreeRecur(Node1 node) {
		if (node == null) return;
		
		if(node.left != null && node.right != null)
		System.out.print(node.left.data+" "+node.right.data+" ");
		
		printBFSTreeRecur(node.left);
		printBFSTreeRecur(node.right);
	}

	public void printPostorderTree(Node1 node) {
		if(node == null) return;
		
		printPostorderTree(node.left);
		printPostorderTree(node.right);
		System.out.print(node.data + " ");
		
	}

	public void printPreorderTree(Node1 node) {
		if(node == null) return;
		
		System.out.print(node.data+" ");
		printPreorderTree(node.left);
		printPreorderTree(node.right);
	}

	BinaryTreeImplimentation1(int data){
		root = new Node1(data);
	}
	
	public void printInorderTree(Node1 node){
		if(node == null) return;
		
		printInorderTree(node.left);
		System.out.print(node.data + " ");
		printInorderTree(node.right);
	}
}

