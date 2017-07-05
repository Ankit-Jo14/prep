package chapter2;

public class test {
	public static void main(String args[]) {
		 
          Node n = new Node(1);
          n.appendToend(2);
          n.appendToend(3);
          n.appendToend(4);
          int k = 1;
         // Node k = n.next;
         // k.next =k.next.next;
          func(n.next, k);
          
          
          
          System.out.println("round ");	  
          
          
	}
	
	
	public static void func(Node n ,int k){
		n.next.data = 100;
		k = 10000364;
	}

}

class Node {
	int data;
	public Node next;

	public Node(int d) {
		this.data = d;
	}

	public void appendToend(int data) {
		Node d = new Node(data);
		Node n = this;
		while (n.next != null) {
			n = n.next;

		}

		n.next = d;
	}
}
