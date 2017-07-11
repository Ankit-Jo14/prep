package chapter2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Question2 {

	public static void main(String[] args) {
		
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
		for (int i = 0; i <= array.length + 1; i++) {
			//printKthToLast(head, i);
		}
		for (int i = 0; i <= array.length + 1; i++) {
			//printKthToLast2(head, i);
		}
		for (int i = 0; i <= array.length + 1; i++) {
			printKthToLast3(head, 1);
		}// TODO Auto-generated method stub
	}

	private static int printKthToLast(LinkedListNode head, int i) {
		int index = 0;
		if(head != null){
			index = printKthToLast(head.next, i)+1;
		}
		if(index == i){
			
			System.out.print(+head.data+" ");
		}
		return index;
	}
	
	private static int printKthToLast2(LinkedListNode head, int i) {
		LinkedListNode front = head;
		LinkedListNode kthbehind = head;
		int counter = 0;
		while(front.next != null){
			if(counter >= i){
				kthbehind = kthbehind.next;
			}
			counter ++;
			front= front.next;
		}
		System.out.print(kthbehind.data +" ");
		return kthbehind.data;
	}
	
	private static int printKthToLast3(LinkedListNode head,int k){
		if (head == null) {
			return 0;
		}
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}


}
