package stack;

public class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char [this.stackSize];
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return(top == this.stackSize -1);
	}
	
	public void push(char item) {
		if(isFull()) {
			System.out.println("full");
		}
		else {
			itemArray[++top] = item;
			System.out.println("push item : " + item);
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			return itemArray[top--];
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			top--;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			return itemArray[top];
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.print("Array Stack >> ");
			for(int i = 0; i <= top; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
		}
	}
}
