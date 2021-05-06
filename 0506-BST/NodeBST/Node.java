package NodeBST;

public class Node <Key extends Comparable<Key>, Value>{
	private Key id;
	private Value name;
	private Node<Key, Value> left, right;
	
	public Node(Key newId, Value newName) {
		id = newId;
		name = newName;
		left = right = null;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public Value getName() {
		return name;
	}

	public void setName(Value name) {
		this.name = name;
	}

	public Node<Key, Value> getLeft() {
		return left;
	}

	public void setLeft(Node<Key, Value> left) {
		this.left = left;
	}

	public Node<Key, Value> getRight() {
		return right;
	}

	public void setRight(Node<Key, Value> right) {
		this.right = right;
	}

}
