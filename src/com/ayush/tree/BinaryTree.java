package com.ayush.tree;

import java.util.Queue;
import java.util.*;

public class BinaryTree {
	Node root = null;

	public Node insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return root;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.poll();
			if (temp.left != null) {
				q.add(temp.left);
			} else {
				temp.left = newNode;
				return root;
			}
			if (temp.right != null) {
				q.add(temp.right);
			} else {
				temp.right = newNode;
				return root;
			}
		}
		return root;
	}
	public void inorder(Node root) {
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public boolean checkMirror(Node root1 , Node root2) {
		if(root1==null && root2==null) {
			return true;
		}
		if(root1 ==null || root2==null ) {
			return false;
		}
		if(root1.data != root2.data) {
			return false;
		}

		boolean f1 = checkMirror(root1.left, root2.right);
		boolean f2 = checkMirror(root1.right, root2.left);
		return  f1 && f2;
		
	}
	public boolean isSymetric(Node root) {
		if(root==null)
			return true;
			
		return checkMirror(root.left, root.right);
	}

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		Node root = b.insert(1);
		b.insert(2);
		b.insert(2);
		b.insert(3);
		b.insert(4);
		b.insert(4);
		b.insert(3);
		System.out.println(b.isSymetric(root));
		

	}

}
