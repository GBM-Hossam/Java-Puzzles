package com.hos.puzzles.linkedlist;
public class SinglyLinkedListHelper {

	public static void printList(SinglyLinkedListNode node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
