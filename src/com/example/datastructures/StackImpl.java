package com.example.datastructures;

public class StackImpl<T> {
	 
    private Node<T> top;
     
    public void push(T element){
        Node<T> nd = new Node<T>();
        nd.value=element;
        
        if(top == null)
        	top = nd;
        else
        {
        	nd.next=top;
        	top = nd;
        }
    }
     
    public T pop(){
    	if(top != null)
    	{
    		T t= top.value;
    		System.out.println("Poping ::"+t);
    		top = top.next;
    		return t;
    	}
    	else
    		return null;
    }
     
     
    public static void main(String a[]){
        StackImpl<Integer> sl = new StackImpl<Integer>();
        sl.push(3);
        sl.push(32);
        sl.push(54);
        sl.pop();
        sl.pop();
        sl.push(89);
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
}
 
