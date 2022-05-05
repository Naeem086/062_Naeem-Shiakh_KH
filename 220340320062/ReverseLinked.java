import java.util.*;

class ReverseLinked{
	static Scanner s = new Scanner(System.in);
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int newdata){
			this.data = newdata;
			next = null;
		}
	}
	
	public void addElement(int key){
		Node temp = new Node(key);
		if(head == null){
			head = temp;
			return;
		}
		
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = temp;
		return;
	}
	
	public Node reverse(Node n){
		Node prev = null;
		Node next = null;
		Node now = n;
		while(now != null){
			next = now.next;
			now.next = prev;
			prev = now;
			now = next;
		}
		n = prev;
		return n;
	}
	
	public void getList(Node n){
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String agrs[]){
		ReverseLinked rl = new ReverseLinked();
		System.out.print("Enter number of elements to enter  : ");
		int num = s.nextInt();
		for(int i=0;i<num;i++){
			System.out.print("Enter Element "+(i+1)+" = ");
			int ele = s.nextInt();
			rl.addElement(ele);
		}
		
		head = rl.reverse(head);
		
		rl.getList(head);
	}
}
