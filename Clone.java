import java.math.*;
import java.util.*;

class Clone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long div = 5, count = 0;

		while(true) {
			count += (long) Math.floor(n/div);
			div *= 5;
			if(n < div)
				break;
		}

		System.out.println(count);
	}
}