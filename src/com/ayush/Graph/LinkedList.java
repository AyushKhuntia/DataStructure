package com.ayush.Graph;


public class LinkedList {
	static Node head=null;
	public static void add(int data) {
		Node newnode = new Node(data);
		Node temp=head;
		if(head==null) {
			head=newnode;
			return;
		}
		else {
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=newnode;
		}
	}
	public static void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.link;
		}
	}
	public static void main(String[] args){
		add(10);
		add(20);
		add(30);
		add(40);
		print();
		
	}
		
}
