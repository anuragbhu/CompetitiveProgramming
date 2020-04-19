import java.util.*;
import java.io.*;
import java.lang.*;

class SlowReaderForCheck {
	public static void main(String[] args){
		
    Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
    sc.nextLine();
		String[] str = new String[n];

    	for(int i = 0; i < n; i++){
      		str[i] = sc.nextLine();
    	}
		System.out.println(maths(str));

	}

	public static int maths(String[] str){
    int sum = 0;
    for(int i = 0; i < str.length; i++){
      if(str[i].equals("Tetrahedron")){
        sum += 4;
      } else if(str[i].equals("Cube")){
        sum += 6;
      } else if(str[i].equals("Octahedron")){
        sum += 8;
      } else if(str[i].equals("Dodecahedron")){
        sum += 12;
      } else if(str[i].equals("Icosahedron")){
        sum += 20;
      }
    }
    return sum;
  }
}