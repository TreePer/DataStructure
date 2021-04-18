package Deque;

public class DQ_Test {
	public static void main(String args[]) {
		char deletedItem;
		DQueue dq = new DQueue();
		
		
		dq.insertFront('a');
		dq.printDQueue();
		
		dq.insertFront('b');
		dq.printDQueue();
		
		dq.insertFront('c');
		dq.printDQueue();
		
		deletedItem = dq.deleteFront();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " front deleted");
		}
		dq.printDQueue();
		
		deletedItem = dq.deleteRear();
		if(deletedItem != 0) {
			System.out.println(deletedItem + " rear deleted");
		}
		dq.printDQueue();
		
		dq.insertRear('d');
		dq.printDQueue();
		dq.insertFront('e');
		dq.printDQueue();
		dq.insertFront('f');
		dq.printDQueue();
		
		
		
		
		
	}

}
