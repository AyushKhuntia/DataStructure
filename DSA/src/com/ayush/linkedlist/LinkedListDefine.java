package com.ayush.linkedlist;

public class LinkedListDefine {
	private ListNode head = null;

	public void insertatBegin(int val) {
		ListNode newNode = new ListNode(val);
		if (head == null) {
			head = newNode;
			head.next = null;

		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public  void insertatLast(int val) {
		ListNode newNode = new ListNode(val);
		ListNode curr = head;
		if (head == null) {
			newNode = head;
			head.next = null;
			return;
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;

	}

	public void print() {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val+" ");
			curr = curr.next;
		}
		System.out.println();
	}

	public ListNode middle() {
		ListNode slow = null;
		ListNode fast = null;
		if (head != null) {
			slow = head;
			fast = head;
		}
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public boolean DetectCycle() {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;

	}
	public void removeNthFromEnd(int n){
		ListNode dummy = new ListNode(0);
		dummy.next=head;
		ListNode fast = head;
		ListNode slow = dummy;
		for(int i=0;i<=n;i++) {
			fast=fast.next;
		}
		while(fast!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next = slow.next.next;
		 
	}
	public static void main(String[] args) {
		LinkedListDefine li1=new LinkedListDefine();
		li1.insertatBegin(10);
		li1.insertatBegin(20);
		li1.insertatLast(30);
		li1.insertatLast(90);
		li1.print();
		li1.removeNthFromEnd(2);
		li1.print();
	}
	

}
