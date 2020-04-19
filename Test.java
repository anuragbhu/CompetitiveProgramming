import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] arr = new int[t];
    int n = 0, rem = 0, ans = 0;
    for(int i = 0; i < t; i++){
    	n = sc.nextInt();
    	ans = 0;
    	while(n != 0){
    		rem = n % 10;
    		ans = (ans * 10) + rem;
    		n /= 10;
    	}
    	arr[i] = ans;
    }
    for(int i = 0; i < t; i++){
    	System.out.println(arr[i]);
    }
    
    sc.close();
  }
}
