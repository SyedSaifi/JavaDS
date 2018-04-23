package com.example.stackqueue;

public class QueueImpl<T> {
	 
    private Node<T> front;
     
    public void enquue(T element){
        Node<T> nd = new Node<T>();
        nd.setValue(element);
        
        if(front == null)
        	front = nd;
        else
        {
        	Node<T> tmp = front;
        	while(tmp.next!=null)
        		tmp=tmp.next;
        	tmp.next =nd;
        }
    }
     
    public T dequeue(){
    	if(front != null)
    	{
    		T t= front.value;
    		System.out.println("Dequeue ::"+t);
    		front = front.next;
    		return t;
    	}
    	else
    		return null;
    }
    
    public void display(){
    	Node<T> tmp = front;
    	while(tmp != null){
    		System.out.println(tmp.value);
    		tmp = tmp.next;
    	}
    }
     
     
    public static void main(String a[]){
        QueueImpl<Integer> sl = new QueueImpl<Integer>();
        sl.enquue(11);
        sl.dequeue();
        sl.enquue(22);
        sl.enquue(33);
        sl.display();
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
 
