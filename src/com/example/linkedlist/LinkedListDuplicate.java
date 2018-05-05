package com.example.linkedlist;

public class LinkedListDuplicate {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node remove_duplicates() {
		Node ptr1 = head;
		Node ptr2 = null;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			while (ptr2.next != null) {
				if (ptr1.data == ptr2.next.data) {
					ptr2.next = ptr2.next.next;
				} else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
		return head;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedListDuplicate list = new LinkedListDuplicate();
		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next = new Node(10);

		System.out.println("Linked List before removing duplicates : \n ");
		list.printList(head);

		//list.remove_duplicates();
		System.out.println("");
		System.out.println("Linked List after removing duplicates : \n ");
		list.printList(list.remove_duplicates());
	}
}
