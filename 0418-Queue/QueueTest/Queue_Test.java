package QueueTest;

public class Queue_Test {
	public static void main(String args[]) {
		int queueSize = 3;
		char deletedItem;
		
		ArrayQueue Q = new ArrayQueue(queueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		Q.printQueue();
		
		
	}

}
