public class AVLTree {

	private class Node {

		int data;
		Node left;
		Node right;
		int height;

		Node(int data) {
			this.data = data;
			this.height = 1;
		} 

	}

	private Node root;
	// Why Private? Because any external class or any 
	// client class can change our root. So, we can't
	// give authority for that.


	public void insert(int item) {

		this.root = insert(this.root, item);
	}

	private Node insert(Node node, int item) {

		if(node == null) {
			Node nn = new Node(item);
			return nn;
		} // this is the base case

		if(item > node.data) {
			node.right = insert(node.right, item);
		} else if(item < node.data) {
			node.left = insert(node.left, item);
		}

		node.height = Math.max(height(node.left), height(node.right)) + 1;
		int bf = bf(node);
		// LL Problem 
		if(bf > 1 && item < node.left.data){
			return rightRotate(node);
		}
		// RR Problem
		if(bf < -1 && item > node.right.data){
			return leftRotate(node);
		}
		// LR Problem
		if(bf > 1 && item > node.left.data){
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// RL Problem
		if(bf < -1 && item < node.right.data) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	private int height(Node node) {
		if(node == null){
			return 0;
		}

		return node.height;
	}

	private int bf(Node node) {
		if(node == null){
			return 0;
		}

		return height(node.left) - height(node.right);
	}

	private Node rightRotate(Node c) {

		// Getting values capture
		Node b = c.left;
		Node T3 = b.right;

		// Rotate
		b.right = c;
		c.left = T3;

		//Height update
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		b.height = Math.max(height(b.left), height(b.right)) + 1;

		return b;
	}

	private Node leftRotate(Node c) {

		// Getting values capture
		Node b = c.right;
		Node T2 = b.left;

		// Rotate
		b.left = c;
		c.right = T2;

		//Height update
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		b.height = Math.max(height(b.left), height(b.right)) + 1;

		return b;
	}

	public void display() {
		display(this.root);
	} // External user calls this method/
	// And this method internally calls the private
	// display method.

	private void display(Node node) {

		// self work

		if(node == null){
			return;
		}

		String str = "";

		if(node.left == null){
			str += ".";
		} else {
			str += node.left.data;
		}

		str += " => " + node.data + " <= ";


		if(node.right == null){
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);
		display(node.left);
		display(node.right);
	}


}