package CQueue;

public class ArrayCQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayCQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return(((rear + 1) % this.queueSize) == front);
	}
	
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("full");
		}
		else {
			rear = (rear + 1) % this.queueSize;
			itemArray[rear] = item;
			System.out.println(item + " inserted");
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			front = (front + 1) % this.queueSize;
			return itemArray[front];
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			front = (front + 1) % this.queueSize;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			return itemArray[(front + 1) % this.queueSize];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.printf("Array Circular Queue >> ");
			for(int i = (front + 1) % this.queueSize;
					i != (rear + 1) % this.queueSize;
					i = ++i % this.queueSize) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
		}
	}
}
