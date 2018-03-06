package com.example.datastructures;

public class LeafNodeBST<T> {
	class Node<T> {
		public int value;
		public Node<T> left;
		public Node<T> right;

		public Node(int value) {
			this.value = value;
		}
	}

	public Node<T> root;

	//---------------------------------------------------------------------------
	public LeafNodeBST<T> insert(int value) {
		Node<T> node = new Node<>(value);
		if (root == null) {
			root = node;
			return this;
		}
		insertRec(root, node);
		return this;
	}

	private void insertRec(Node<T> latestRoot, Node<T> node) {
		if (latestRoot.value >= node.value) {
			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertRec(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRec(latestRoot.right, node);
			}
		}
	}
	
	private void leafNode(){
		printLeafNode(root);
	}

	private void printLeafNode(Node<T> root){
		if(root == null)
			return;
		
		if(root.left == null && root.right == null)
			System.out.println(root.value);
		
		printLeafNode(root.left);
		printLeafNode(root.right);
	}
	public static void main(String[] args) {
		LeafNodeBST<Integer> bst = new LeafNodeBST<>();
		bst.insert(40).insert(25).insert(78).insert(10).insert(3).insert(17).insert(32).insert(30).insert(38).insert(78)
				.insert(50).insert(93);
		System.out.println("Root elements are..");
		bst.leafNode();
	}

}
