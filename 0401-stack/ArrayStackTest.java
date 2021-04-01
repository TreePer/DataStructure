package stack;

public class ArrayStackTest {
	public static void main(String args[]) {
		ArrayStack1<String> stack = new ArrayStack1<String>();
		
		stack.push("apple");
		stack.print();
		stack.push("orange");
		stack.print();
		stack.push("cherry");
		stack.print();
		stack.push("pear");
		stack.print();
		stack.push("chicken");
		stack.print();
		stack.push("meat");
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.push("grape");
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
	}

}
