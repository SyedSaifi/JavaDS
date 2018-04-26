package com.example.linkedlist;

//Java program to swap two given nodes of a linked list

public class SwapLinkedlist<T> {
	public static void swapNodes(SinglyLinkedListImpl node, int x, int y) {
		if (x == y)
			return;

		Node prevX = null;
		Node currX = node.head;
		
		while (currX != null && (int)currX.value != x) {
			prevX = currX;
			currX = currX.next;
		}

		Node prevY = null;
		Node currY = node.head;
		
		while (currY != null && (int)currY.value != y) {
			prevY = currY;
			currY = currY.next;
		}

		if (currX == null || currY == null)
			return;

		if (prevX != null)
			prevX.next = currY;
		else
			node.head = currY;

		if (prevY != null)
			prevY.next = currX;
		else
			node.head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

	public static void main(String[] args) {
		SinglyLinkedListImpl<Integer> llist = new SinglyLinkedListImpl<Integer>();

		llist.add(7);
		llist.add(6);
		llist.add(5);
		llist.add(4);
		llist.add(3);
		llist.add(2);
		llist.add(1);

		System.out.print("\n Linked list before calling swapNodes() ");
		llist.traverse();

		SwapLinkedlist.swapNodes(llist,4, 3);

		System.out.print("\n Linked list after calling swapNodes() ");
		llist.traverse();
	}
}
