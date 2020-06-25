import java.util.*;

class Node {

	int key;
	Node left;
	Node right;

	Node(int k) {
		key = k;
	}
}

class TreeTraversal {

	public static void main(String[] args) {
		
		// Node root = null;

		Node root = new Node(8);
		root.right = new Node(6);
		root.right.left = new Node(2);
		root.right.right = new Node(4);
		root.right.right.left = new Node(3);

		
	}

	static void inorder(Node root) {

		if(root != null){
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	static void preorder(Node root) {

		if(root != null){
			System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	static void postorder(Node root) {

		if(root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + " ");
		}
	}

	static void printLevel(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while(!q.isEmpty()) {

			Node curr = q.poll();
			System.out.print(curr.key + " ");

			if(curr.left != null)
				q.add(curr.left);

			if(curr.right != null)
				q.add(curr.right);
		}
	}

	static int sizeOfBinaryTree(Node root) {

		if(root == null) return 0;

		int count = 0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while(!q.isEmpty()) {

			Node curr = q.poll();																																																																																																																																																																																																																																																																																															
		}
	}
}