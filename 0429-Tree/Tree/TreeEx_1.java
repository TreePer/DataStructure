package Tree;

public class TreeEx_1 {
	public static void main(String args[]) {
		LinkedTree t = new LinkedTree();
		TreeNode n7 = t.makeBT(null, 'd', null);
		TreeNode n6 = t.makeBT(null, 'c', null);
		TreeNode n5 = t.makeBT(null, 'b', null);
		TreeNode n4 = t.makeBT(null, 'a', null);
		TreeNode n3 = t.makeBT(n6, '/', n7);
		TreeNode n2 = t.makeBT(n4, '*', n5);
		TreeNode n1 = t.makeBT(n2, '-', n3);
		
		System.out.printf("\n Preorder : ");
		t.preorder(n1);
		System.out.printf("\n Inorder : ");
		t.inorder(n1);
		System.out.printf("\n Postorder : ");
		t.postorder(n1);
	}

}
