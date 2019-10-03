package com.hos.puzzles.linkedlist;
public class ListMerge {

	public SinglyLinkedListNode mergeInBetween(SinglyLinkedListNode list1,
			SinglyLinkedListNode list2, int a, int b) {

		SinglyLinkedList finalList = new SinglyLinkedList();
		boolean isSeeking = false, foundTarget = false;
		int increament = 1;

		while (list1 != null) {
			int node1Data = list1.data;

			if (increament == a && !foundTarget) {
				isSeeking = true;
				foundTarget = true;

				// Append List2 Data
				while (list2 != null) {
					finalList.insertNode(list2.data);
					list2 = list2.next;
				}

			} else if (increament == b && isSeeking) {
				isSeeking = false;
			} else {
				if (!isSeeking)
					finalList.insertNode(node1Data);
			}

			increament++;
			list1 = list1.next;
		}

		return finalList.head;
	}

	public static void main(String[] args) {
		int[] list1 = { 1, 4, 6, 3, 2, 7 };
		int[] list2 = { 5, 6, 4, 3, 8, 2, 1 };

		int a = 2, b = 4;

		ListMerge r = new ListMerge();
		SinglyLinkedList slist1 = new SinglyLinkedList();
		SinglyLinkedList slist2 = new SinglyLinkedList();

		for (int i = 0; i < list1.length; i++)
			slist1.insertNode(list1[i]);

		for (int i = 0; i < list2.length; i++)
			slist2.insertNode(list2[i]);

		SinglyLinkedListHelper.printList(r.mergeInBetween(slist1.head,
				slist2.head, a, b));
	}

}
