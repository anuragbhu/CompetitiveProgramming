import java.util.*;

public class Heap {

	ArrayList<Integer> data = new ArrayList<>();
	//Why ArrayList? As in Array we need to specify the size.

	public void add(int item) {

		data.add(item);

		upheapify(data.size()-1);
	}

	private void upheapify(int ci) {
		//Why Private? Because we doesn't want any
		//external user calls this function.
		//It automatically gets call, once user add
		//an item.

		//pi = parent index
		//ci = child index

		int pi = (ci - 1) / 2;

		if(data.get(ci) < data.get(pi)){
			swap(ci, pi);
			upheapify(pi);
		}
	}


	private void swap(int i, int j) {

		int ith = data.get(i);
		int jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}


	public void display() {
		System.out.println(data);
	}


	public int size() {

		return this.data.size();
	}


	public boolean isEmpty() {

		return this.size() == 0;
	}

	public int remove() {

		//step 1
		//swapping highest priority element with the
		//last element
		swap(0, this.data.size()-1);
		//step 2 
		// remove highest priority element from last
		//index
		int rv = this.data.remove(this.data.size()-1);
		//step 3
		//call downheapify for parent node.
		//This will rearrange the nodes a/t heap property.
		downheapify(0);
		//step 4
		//return removed element.

		return rv;
	}

	private void downheapify(int pi){

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int mini = pi; // assumming this is smallest.

		if(lci < this.data.size() && data.get(lci) < data.get(mini)){
			mini = lci;
		}

		if(rci < this.data.size() && data.get(rci) < data.get(mini)){
			mini = rci;
		}

		if(mini != pi){
			swap(pi, mini);
			downheapify(mini);
		}
	}

	public int get() {

		return this.data.get(0);
	}
}