package ArrayQueueTest;

public class ArrayQueue_Test {
	public static void main(String args[]) {
		ArrayQueue<String> q = new ArrayQueue<String>();
		
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("orange");
		
		q.print();
		
		q.remove();
		q.print();
		
		q.add("grape");
		q.print();
		
		q.remove();
		q.print();
		
		q.add("lemon");
		q.print();
		
		q.add("lime");
		q.print();
		
		q.add("mango");
		q.print();
		
		q.add("kiwi");
		q.print();
		
		
		
	}

}
