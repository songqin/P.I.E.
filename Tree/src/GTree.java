//Generic Tree
public class GTree{
	public abstract class Node{
		private Node [] children;
		public Node(Node [] children){
			this.children=children;
		}
		public Node getChild(int index){
			return children[index];
		}
		public int getNumChildren(){
			return children.length;
		}
	}
	public class IntNode extends Node{
		public IntNode(Node[] children){
			super(children);
		}
	}
	public static void main(String[] args){
		System.out.println("Tree:");
	}
}
