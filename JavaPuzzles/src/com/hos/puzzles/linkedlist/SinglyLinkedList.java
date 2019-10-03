package com.hos.puzzles.linkedlist;
public class SinglyLinkedList {
	public SinglyLinkedListNode head;
	public SinglyLinkedListNode tail;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;

	}

	public void insertNode(int d) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(d);
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}

		this.tail = node;
	}

}
