package stack;

public class ListStackTest {
	public static void main(String args[]) {
		ListStack<String> stack = new ListStack<>();
		stack.push("apple");
		stack.print();
		stack.push("orange");
		stack.print();
		stack.push("grape");
		stack.print();
		stack.push("cherry");
		stack.print();
		stack.push("banana");
		stack.print();
		stack.pop();
		stack.print();
		
	}

}
