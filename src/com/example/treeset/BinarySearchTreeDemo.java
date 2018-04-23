package com.example.treeset;

import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTree<T> {
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
	public BinarySearchTree<T> insert(int value) {
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

	//---------------------------------------------------------------------------
	public int findMinimum() {
		if (root == null) {
			return 0;
		}
		Node<T> currNode = root;
		while (currNode.left != null) {
			currNode = currNode.left;
		}
		return currNode.value;
	}

	//---------------------------------------------------------------------------
	public int findMaximum() {
		if (root == null) {
			return 0;
		}

		Node<T> currNode = root;
		while (currNode.right != null) {
			currNode = currNode.right;
		}
		return currNode.value;
	}

	//----------------------------------------------------------------------------
	public void printInorder() {
		printInOrderRec(root);
		System.out.println("");
	}

	private void printInOrderRec(Node<T> currRoot) {
		if (currRoot == null) {
			return;
		}
		printInOrderRec(currRoot.left);
		System.out.print(currRoot.value + ", ");
		printInOrderRec(currRoot.right);
	}

	//----------------------------------------------------------------------------
	public void printPreorder() {
		printPreOrderRec(root);
		System.out.println("");
	}

	private void printPreOrderRec(Node<T> currRoot) {
		if (currRoot == null) {
			return;
		}
		System.out.print(currRoot.value + ", ");
		printPreOrderRec(currRoot.left);
		printPreOrderRec(currRoot.right);
	}

	//----------------------------------------------------------------------------
	public void printPostorder() {
		printPostOrderRec(root);
		System.out.println("");
	}

	private void printPostOrderRec(Node<T> currRoot) {
		if (currRoot == null) {
			return;
		}
		printPostOrderRec(currRoot.left);
		printPostOrderRec(currRoot.right);
		System.out.print(currRoot.value + ", ");
	}
	//------------------------------------------------------------------------------
	public void levelOrderTraversal() {
		 
        Queue<Node> node = new LinkedList<>();
        if(this.root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        node.add(this.root);
        while (!node.isEmpty()) {
 
            Node tmpNode = node.remove();
            if(tmpNode.left != null) { node.add(tmpNode.left); }
            if(tmpNode.right != null) { node.add(tmpNode.right); }
            System.out.print(tmpNode.value+" ");
        }
    }
}

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.insert(40).insert(25).insert(78).insert(10).insert(3).insert(17).insert(32).insert(30).insert(38).insert(78)
				.insert(50).insert(93);
		System.out.println("Inorder traversal");
		bst.printInorder();
		System.out.println("Preorder Traversal");
		bst.printPreorder();
		System.out.println("Postorder Traversal");
		bst.printPostorder();
		System.out.println("Level Order Traversal");
		bst.levelOrderTraversal();
		System.out.println();
		System.out.println("The minimum value in the BST: " + bst.findMinimum());
		System.out.println("The maximum value in the BST: " + bst.findMaximum());
	}
}
