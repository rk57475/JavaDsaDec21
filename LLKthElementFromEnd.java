package javadsa;

public class LLKthElementFromEnd {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static Node kTh(Node head, int k) {
		Node p1 = head;
		Node p2 = head;
		for(int i=0; i<k; i++) {
			p2=p2.next;
		}
		while(p2!=null) {
			p2=p2.next;
			p1=p1.next;
		}
		return p1;
	}
	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		Node head = node1;
		Node k = kTh(head,5);
		System.out.println(k.data);
	}
	
	
}
