package QueueTest;

public class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.queueSize - 1);
	}
	
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("full");
		}
		else {
			itemArray[++rear] = item;
			System.out.println("insert : " + item);
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			return itemArray[++front];
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			++front;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			return itemArray[front + 1];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.printf("Array Queue >> ");
			for(int i = front + 1; i <= rear; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
		}
	}
	
	

}
