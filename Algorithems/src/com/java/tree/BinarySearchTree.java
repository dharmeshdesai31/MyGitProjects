package com.java.tree;


public class BinarySearchTree {

	
	public static void main(String[] args) 
	{
		BinaryTreeImplimentation2 bTree = new BinaryTreeImplimentation2(8);
		bTree.root.left = new Node2(3);
		bTree.root.right = new Node2(10);
		
		bTree.root.left.left = new Node2(1);
		bTree.root.left.right = new Node2(6);
		
		bTree.root.left.right.left = new Node2(4);
		bTree.root.left.right.right = new Node2(7);
		
		bTree.root.right.right = new Node2(14);
		bTree.root.right.right.left = new Node2(13);
		System.out.print("Search Path: ");
		bTree.searchcNode(bTree.root, 4);
		
		BinaryTreeImplimentation2 tree = new BinaryTreeImplimentation2();
		 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println();
        System.out.print("BST:");
        tree.printBFSTree(tree.root);
	}
}

class Node2{
	int data;
	Node2 left;
	Node2 right;
	
	Node2(int d){
		this.data = d;
		this.left = this.right = null;
	}
}

class BinaryTreeImplimentation2{
	Node2 root;
	
	BinaryTreeImplimentation2(){
		root = null;
	}

	BinaryTreeImplimentation2(int data){
		root = new Node2(data);
	}
	
	public Node2 searchcNode(Node2 root, int key){
		System.out.print(root.data+" ");
		if(root.data == key || root == null) return root;
		
		if(key < root.data) 
			return searchcNode(root.left, key);
		
		return searchcNode(root.right, key);	
	}
	
	public void insert(int key){
		root = insertNode(root, key);
	}
	
	public Node2 insertNode(Node2 root, int key){
		if(root == null)
		{
			root = new Node2(key);
			return root;
		}
		
		if(key < root.data)
			root.left = insertNode(root.left, key);
		else if(key > root.data)
			root.right = insertNode(root.right, key);
		
		return root;
	}
	
	public void printBFSTree(Node2 node){
		System.out.print(node.data+" ");
		printBFSTreeRecur(node);
	}
	
	public void printBFSTreeRecur(Node2 node) {
		if (node == null) return;
		
		if(node.left != null && node.right != null)
		System.out.print(node.left.data+" "+node.right.data+" ");
		
		printBFSTreeRecur(node.left);
		printBFSTreeRecur(node.right);
	}

}

