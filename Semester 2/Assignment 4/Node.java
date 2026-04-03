package Assignment4;

public class Node{
	protected int regd_no;
	protected float mark;
	protected Node next;
	
	public Node(){
		this(0,0f,null);
	}
	public Node(int regd_no , float mark , Node next){
		this.regd_no = regd_no;
		this.mark = mark;
		this.next = next;
		
		
	}
	public Node(int regd_no, float mark) {
		this.regd_no = regd_no;
		this.mark = mark;
	}
	
}
