package com.example.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedListImpl<T> {
	 
    private class Node {
        T value;
        Node next;
        Node prev;
 
        public Node(T element, Node next, Node prev) {
            this.value = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    
    public void addFirst(T element) {
        Node node = new Node(element, head, null);
        
        if(head != null)
        	head.prev = node;
        head = node;
        if(tail == null)
        	tail = node;
        size++;
        System.out.println("adding: "+element);
    }
     
    public void addLast(T element) {
        Node node = new Node(element, null, tail);
        
        if(tail != null)
        	tail.next = node;
        tail = node;
        if(head == null)
        	head = node;
        size++;
        System.out.println("adding: "+element);
    }
     
    public void iterateForward(){
        System.out.println("iterating forward..");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void iterateBackward(){
        System.out.println("iterating backword..");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.prev;
        }
    }
     
    public T removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+tmp.value);
        return tmp.value;
    }
     
    public T removeLast() {
        if (size == 0) throw new NoSuchElementException();
        
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.value);
        return tmp.value;
    }
     
    public static void main(String a[]){
         
        DoublyLinkedListImpl<Integer> dll = new DoublyLinkedListImpl<Integer>();
        dll.addFirst(10);
        dll.addFirst(34);
        dll.addLast(56);
        dll.addLast(364);
        dll.iterateForward();
        dll.removeFirst();
        dll.removeLast();
        dll.iterateBackward();
    }
}
