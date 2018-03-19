package com.example.linkedlist;

public class MiddleLinkedList<T> extends SinglyLinkedListImpl<T>{

	public static void main(String[] args) {
		SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<>();
		sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        sl.add(99);
        sl.add(49);
        sl.add(59);
		sl.traverse();
		
		MiddleLinkedList<Integer> mid = new MiddleLinkedList<>();
		System.out.println("Middle element is :: "+mid.getMiddleNode(sl.head));
	}
	
	public T getMiddleNode(Node<T> head){
		Node<T> slow = head;
		Node<T> fast = head;
		int length = 0;
		
		while(fast.next != null){
			fast = fast.next;
			length++;
			
		if(length%2==0)
			slow = slow.next;
		}
		
		return slow.value;
	}
}
