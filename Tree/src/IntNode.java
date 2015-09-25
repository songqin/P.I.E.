/* Binary Search Tree
 * Store ordered or sorted data
 * Many people mean BST when they say tree
 * 
 */
public class IntNode {
	// public abstract class Node{
	// private Node left;
	// private Node right;
	// public Node(Node left,Node right){
	// this.left=left;
	// this.right=right;
	// }
	// public abstract int getValue();
	// public Node getRight(){
	// return right;
	// }
	// public Node getLeft(){
	// return left;
	// }
	// }
	// public class IntNode {
	private IntNode left;
	private IntNode right;
	private int value;

	public IntNode(IntNode left, IntNode right, int value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	IntNode findNode(IntNode root, int value) {
		IntNode current = root;
		while (current != null) {
			if (current.getValue() == value) {
				return current;
			} else if (current.getValue() > value) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}
		return null;// value not found
	}
	IntNode findNodeRe(IntNode root, int value){
		if(root==null) return root;
		if(root.getValue()==value) return root;
		else if(root.getValue()<value) return findNodeRe(root.getRight(),value);//missing return
		else return findNodeRe(root.getLeft(),value);//missing return 
	}
	public IntNode getRight() {
		// TODO Auto-generated method stub
		return right;
	}

	public IntNode getLeft() {
		// TODO Auto-generated method stub
		return left;
	}

	// }
	public static void main(String[] args) {
		IntNode n1 = new IntNode(null, null, 1);
		IntNode n4 = new IntNode(null, null, 4);
		IntNode n3 = new IntNode(n1, n4, 4);
		
		IntNode n7 = new IntNode(null, null, 7);
		IntNode n12 = new IntNode(null, null, 12);
		IntNode n10 = new IntNode(n7, n12, 4);
		IntNode n5 = new IntNode(n3, n10, 4);
		System.out.println(n5.findNode(n5, 12));//? no need of n5, n7
		System.out.println(n7.findNode(n5, 12));
		System.out.println(n5.findNodeRe(n5, 12));//? no need of n5, n7
		System.out.println(n7.findNodeRe(n5, 12));
		
	}
}
