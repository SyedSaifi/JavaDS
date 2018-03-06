package com.example.datastructures;

public class NthLastElementLinkedList<T> extends SinglyLinkedListImpl<T>{

	public static void main(String[] args) {
		SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<>();
		sl.add(3);
		sl.add(5);
		sl.add(7);
		sl.add(9);
		sl.add(11);
		sl.traverse();
		
		NthLastElementLinkedList<Integer> nth = new NthLastElementLinkedList<>();
		nth.getLastNode(3);
	}
	
	public T getLastNode(int n){
		Node<T> slow = head;
		Node<T> fast = head;
		int start = 1;
		
		while(fast.next != null){
			fast = fast.next;
			start++;
			
		if(start > n)
			slow = slow.next;
		}
		
		return slow.value;
	}

}
