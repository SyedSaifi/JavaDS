package com.example.datastructures;

public class MyQueueImpl {
    
    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;
     
    public MyQueueImpl(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
 
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: "+item);
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArr[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is pushed to Queue !");
        }
    }
 
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Pop operation done ! removed: "+queueArr[front-1]);
                front = 0;
            } else {
                System.out.println("Pop operation done ! removed: "+queueArr[front-1]);
            }
            currentSize--;
        }
    }
 
    public boolean isQueueFull(){
        return (currentSize == capacity);
    }
     
    public boolean isQueueEmpty(){
        return (currentSize == 0);
    }
     
    public static void main(String a[]){
         
        MyQueueImpl queue = new MyQueueImpl(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}