package com.example.treeset;

import com.example.treeset.BinarySearchTree.Node;

public class MirrorBST<T> {
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
	public MirrorBST<T> insert(int value) {
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
	//-------------------------------------------------------------------

	private Node<T> mirror(Node<T> root){
		if(root == null)
			return root;
		
		Node<T> left = mirror(root.left);
		Node<T> right = mirror(root.right);
		
		root.left = right;
		root.right= left;
		
		return root;
	}
	//------------------------------------------------------------------
	
	private boolean areMirror(Node<T> root1, Node<T> root2) 
    {
        if (root1 == null && root2 == null)
            return true;
 
        if (root1 == null || root2 == null) 
            return false;
 
        return root1.value == root2.value
                && areMirror(root1.left, root2.right)
                && areMirror(root1.right, root2.left);
    }
	//------------------------------------------------------------------
	
	private void printPreOrderRec(Node<T> currRoot) {
		if (currRoot == null) {
			return;
		}
		System.out.print(currRoot.value + ", ");
		printPreOrderRec(currRoot.left);
		printPreOrderRec(currRoot.right);
	}
	//------------------------------------------------------------------
	
	public static void main(String[] args) {
		MirrorBST<Integer> bst = new MirrorBST<>();
		bst.insert(40).insert(25).insert(78).insert(10).insert(3).insert(17).insert(32).insert(30).insert(38)
				.insert(50).insert(93);
		System.out.println("Original tree");
		bst.printPreOrderRec(bst.root);
		System.out.println("");
		System.out.println("Mirror tree");
		bst.printPreOrderRec(bst.mirror(bst.root));
		System.out.println("");
		//bst.printPreOrderRec(bst.mirror(bst.root));
		System.out.println("Is the trees mirror image of each other :: "+bst.areMirror(bst.root, bst.mirror(bst.root)));
	}

}
