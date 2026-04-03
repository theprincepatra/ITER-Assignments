
package Assignment4;

import java.util.Scanner;

public class LinkList {
	
	static Scanner sc = new Scanner(System.in);
	
	static Node start = null;
	
	public static void create (Node start) {
		
		System.out.println("Enter regd_no: ");
		int regd_no = sc.nextInt();
		System.out.println("Enter mark: ");
		float mark = sc.nextFloat();
		
		Node newNode = new Node(regd_no,mark);
		
		newNode.next = LinkList.start;
		
		LinkList.start = newNode;
		
	}
	public static void display(Node start) {
		if(start.next == null) {
			System.out.println("List is empty");
			return;
		}
		Node i = start;
		System.out.print("[");
		while(i.next != null) {
			System.out.print(" "+ i.mark +",");
		}
		System.out.print("]");
		return;
		
	}
	
	public static Node InsBeg(Node start) {
		System.out.println("Enter regd_no: ");
		int regd_no = sc.nextInt();
		System.out.println("Enter mark: ");
		float mark = sc.nextFloat();
		Node newNode = new Node(regd_no , mark);
		
		newNode.next = start;
		return start;
	}
	public static Node InsEnd(Node start) {
		if(start.next == null) {
			System.out.println("List is empty");
			return start;
		}
		Node i = start;
		while(i.next != null) {
			i = i.next;
		}
		System.out.println("Enter regd_no: ");
		int regd_no = sc.nextInt();
		System.out.println("Enter mark: ");
		float mark = sc.nextFloat();
		Node end = new Node(regd_no , mark);
		i.next = end;
		end.next = null;
		return start;
	}
	public static Node InsAny(Node start) {
		System.out.println("Ente the index at which u want to insert :");
		int position = sc.nextInt();
		int i = 0;
		Node j = start;
		Node pre = null;
		while (j.next != null && i!= position) {
			i++;
			j = j.next;
			if(i < position ) {
				pre = j;
			}
			
		}
		if(j.next == null) {
			System.out.println("Index out of bound");
			return start;
		}else if(i == position) {
			System.out.println("Enter regd_no: ");
			int regd_no = sc.nextInt();
			System.out.println("Enter mark: ");
			float mark = sc.nextFloat();
			Node end = new Node(regd_no , mark);
			Node newNode = new Node(regd_no,mark);
			newNode.next= pre.next;
			pre.next = newNode;
			
		}
		
		return start;
	}
		
	

}
