package com.example.linkedlist;

public class IntersectingNodeLinkedList {
	
    public static <T> int getNode(SinglyLinkedListImpl s1, SinglyLinkedListImpl s2) {
    	Node <T> head1 = s1.head;
    	Node <T> head2 = s2.head;
    	
        int c1 = s1.getCount(head1);
        int c2 = s2.getCount(head2);
        int d;
 
        if (c1 > c2) 
            return IntersectingNodeLinkedList.getIntesectionNode(c1-c2, head1, head2);
        else 
            return IntersectingNodeLinkedList.getIntesectionNode(c2-c1, head2, head1);
    }
 
    private static <T> int getIntesectionNode(int d, Node<T> node1, Node<T> node2) {
        Node current1 = node1;
        Node current2 = node2;
        
        for (int i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        
        while (current1 != null && current2 != null) {
            if (current1.value == current2.value) {
                return (int) current1.value;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
 
        return -1;
    }

	public static void main(String[] args) {
		SinglyLinkedListImpl<Integer> s1 = new SinglyLinkedListImpl<Integer>();
        s1.add(3);
        s1.add(32);
        s1.add(54);
        s1.add(89);
        s1.add(99);
        
        SinglyLinkedListImpl<Integer> s2 = new SinglyLinkedListImpl<Integer>();
        s2.add(2);
        s2.add(30);
        s2.add(54);
        s2.add(89);
        s2.add(99);
        
        System.out.println("The intersecting node is :: "+IntersectingNodeLinkedList.getNode(s1, s2));
	}

}
