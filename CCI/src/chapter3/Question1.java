package chapter3;

import java.util.HashSet;
import CtCILibrary.LinkedListNode;

public class Question1 {

	public static void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		if (n != null) {
			set.add(n.data);
		}
		while (n.next != null) {
			if (set.contains(n.next.data)) {
				n.next = n.next.next;
			} else {
				set.add(n.next.data);
				previous = n;
			}
			n = n.next;
		}
	}

	public static LinkedListNode deleteNode(LinkedListNode head, int data) {
		LinkedListNode n = head;
		LinkedListNode previous = null;
		if (head.data == data) {
			return head.next;
		} else {
			while (n != null) {
				if (n.data == data) {
					previous.next = n.next;
					return head;
				}
				previous = n;
				n = n.next;
			}
			return head;
		}

	}

	public static void main(String[] args) {
		LinkedListNode first = new LinkedListNode(0, null, null); // AssortedMethods.randomLinkedList(1000,
																	// 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 3; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}

		System.out.println(head.printForward());
		LinkedListNode k =  deleteNode(head, 1);
		// deleteDups(head);
		System.out.println(head.printForward());
	}
}
