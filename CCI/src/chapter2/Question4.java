package chapter2;

import CtCILibrary.LinkedListNode;

public class Question4 {

	public static void main(String[] args) {
		int[] vals = {33,9,2,3,10,10389,838,874578,5};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		System.out.println(Question4.partition(head,33).printForward());

	}

	
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode head = null;
		LinkedListNode headEnd = null;
		LinkedListNode tail = null;
		LinkedListNode tailEnd = null;
		
		while(node!=null){
			if(node.data < x){
				
				if(head == null){
					head = node;
					headEnd= node;
				    
				}else{
					headEnd.next = node;
					headEnd = node;
					
				}
			
			}else{
				if(tail == null){
					tail = node;
					tailEnd = node;
				}else{
					 
					
					tailEnd.next =node;
					tailEnd = node;
				}     
			}
			node = node.next;
		}
		tailEnd.next = null;
		headEnd.next = tail;
		return head;
		
	}
}
