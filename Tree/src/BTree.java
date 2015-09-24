//Binary Tree
public class BTree {
	public abstract class Node {
		private Node left;//missing private
		private Node right;
		public Node(Node left, Node right){
			this.left=left;
			this.right=right;
		}
		public Node getLeft(){return left;}
		public Node getRight(){return right;}
	}
	public class IntNode extends Node{
		private int value;
		public IntNode(Node left, Node right, int value) {
			super(left, right);
			this.value=value;
			// TODO Auto-generated constructor stub
		}
		public int getValue(){
			return this.value;
		}
	}
	public static void main(String[] args){
		System.out.println("B-Tree:");
	}
}
