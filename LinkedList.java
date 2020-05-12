public class LinkedList<E> {

	Node<E> head;

	static class Node<E> {
		E data;
		Node<E> next;
	
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	void add(E data) {
		Node<E> toAdd = new Node<>(data);

		if(isEmpty()){
			head = toAdd;
			return;
		}

		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = toAdd;
	}

	boolean isEmpty() {
		if(head == null){
			return true;
		} else {
			return false;
		}
	}

	void print() throws Exception {
		if(isEmpty()){
			throw new Exception("Cannot print empty LL");
		} else {
			Node<E> temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}



	int count() {
		if(isEmpty()){
			return 0;
		} else {
			int count = 0;
			Node<E> temp = head;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
	}

	int sumOfLL() {
		if(isEmpty()){
			return 0;
		} else {
			int sum = 0;
			Node<E> temp = head;
			while(temp != null) {
				sum += (int)temp.data;
				temp = temp.next;
			}
			return sum;
		}
	}

	int maxOfLL() {
		if(isEmpty()){
			return 0;
		} else {
			int max = 0, variable = 0;
			Node<E> temp = head;
			while(temp != null) {

				variable = (int)temp.data;
				if(variable > max){
					max = variable;
				}
				temp = temp.next;
			}
			return max;
		}
	}


	 print() throws Exception {
		if(isEmpty()){
			throw new Exception("Cannot print empty LL");
		} else {
			Node<E> temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}


	public static void main(String[] args) throws Exception {

		LinkedList<Integer> myLL = new LinkedList<>();
		// myLL.print();
		myLL.add(31);
		myLL.add(42);
		myLL.add(1);
		myLL.add(12131);
		myLL.add(12);
		myLL.print();
		System.out.println(myLL.count());
		System.out.println(myLL.sumOfLL());
		System.out.println(myLL.maxOfLL());

	}


}