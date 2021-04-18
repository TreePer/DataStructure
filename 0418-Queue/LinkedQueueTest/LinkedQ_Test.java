package LinkedQueueTest;

public class LinkedQ_Test {
	public static void main(String args[]) {
		char deletedItem;
		LinkedQueue lq = new LinkedQueue();
		
		lq.enQueue('A');
		lq.printQueue();
		
		lq.enQueue('B');
		lq.printQueue();
		
		deletedItem = lq.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		lq.printQueue();
		
		lq.enQueue('C');
		lq.printQueue();
		
		deletedItem = lq.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		lq.printQueue();
		
		deletedItem = lq.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		lq.printQueue();
		
		deletedItem = lq.deQueue();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " deleted");
		}
		lq.printQueue();
		
	}

}
