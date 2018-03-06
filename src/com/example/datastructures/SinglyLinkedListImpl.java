package com.example.datastructures;

public class SinglyLinkedListImpl<T> {
	 
    public Node<T> head;
    public Node<T> tail;
    public int size;
     
    public void add(T element){
        Node<T> nd = new Node<T>();
        nd.value=element;
        size++;

        if(head == null){
            head = nd;
            tail = nd;
        } else {
            tail.next=nd;
            tail = nd;
        }
    }
    
    public void deleteFront(){
        
        if(head == null){
            System.out.println("Underflow...");
        }
        Node<T> tmp = head;
        head = tmp.next;
        size--;
        if(head == null){
            tail = null;
        }
        System.out.println("Deleted: "+tmp.value);
    }
     
    public void addAt(T element, int pos){
         
        Node<T> tmp = head;
        Node<T> nd = new Node<T>();
        
        if(pos == 0){
            nd.value=element;
            nd.next=head;
            head=nd;
            size++;
        }
        else
        {
	        if(pos <= size){
	        for(int i=1;i <= size; i++){
	            if(i == pos){
	                nd.value=element;
	                nd.next=tmp.next;
	                size++;
	                tmp.next=nd;
	                break;
	            }
	            tmp = tmp.next;
	        }
	        }else {
	            System.out.println("Out of index..");
	        }
        }
    }
     
    public void deleteAt(int pos){
         
    	Node<T> tmp = head;
        
        if(pos == 0)
        {
        	head = tmp.next;
        	size--;
        }
        else
        {
	        if(pos <= size){
	        for(int i=1;i <= size; i++){
	            if(i == pos){
	            	Node<T> nd = tmp.next;
	                tmp.next=nd.next;
	                size--;
	                nd = null;
	                break;
	            }
	            tmp = tmp.next;
	        }
	        }else {
	            System.out.println("Out of index..");
	        }
        }
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
    
    public T getMiddleNode(){
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
     
    public void traverse(){
         
        Node<T> tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
     
    public static void main(String a[]){
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        sl.add(99);
        sl.add(49);
        sl.add(59);
        sl.traverse();
        System.out.println("Nth last node ::"+sl.getLastNode(2));
        System.out.println("Middle node ::"+sl.getMiddleNode());
        //sl.addAt(76, 1);
        //sl.deleteAt(0);
        //sl.deleteFront();
        //sl.deleteAt(3);
         
    }
}
 
class Node<T> implements Comparable<T> {
     
    public T value;
    public Node<T> next;
     
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> ref) {
        this.next = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}