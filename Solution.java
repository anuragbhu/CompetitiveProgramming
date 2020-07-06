import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

 
public class Solution {

  static class FastReader {

    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() { 
      br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next() { 
      while (st == null || !st.hasMoreElements()) { 
        try { 
          st = new StringTokenizer(br.readLine()); 
        } catch (IOException e) { 
          e.printStackTrace(); 
        } 
      } 
      return st.nextToken(); 
    } 

    int nextInt() { 
      return Integer.parseInt(next()); 
    } 

    long nextLong() { 
      return Long.parseLong(next()); 
    } 

    double nextDouble() { 
      return Double.parseDouble(next()); 
    } 

    String nextLine() { 
      String str = ""; 
      try { 
        str = br.readLine(); 
      } catch (IOException e) { 
        e.printStackTrace(); 
      } 
      return str; 
    } 
  }
 
  public static void main(String args[]) throws IOException {

    try {
      FileOutputStream output = new FileOutputStream("temp.out");
      PrintStream out = new PrintStream(output);
      //Diverting the output stream into file "temp.out".Comment the below line to use console
      System.setOut(out);
  
      InputStream input = new FileInputStream("temp.in");
      //Diverting the input stream into file "temp.in".Comment the below line to use console
      System.setIn(input);
  
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  
    FastReader sc = new FastReader();
    PrintWriter wr = new PrintWriter(System.out);
 
    int t = 1;
    t = sc.nextInt();    //Comment this line if there is single test case
    
    while((t--) != 0) {

    	int m = sc.nextInt();
    	int n = sc.nextInt();

    	char[][] arr = new char[m][n];

    	for(int i = 0; i < m; i++) {

    		String test = sc.nextLine();

    		for(int j = 0; j < n; j++) {
    			
    			arr[i][j] = test.charAt(j);

    		}
    		
    	}
    	int count = 0;
    	while(true) {
    		boolean ans = task1(arr, m, n);
    		
    		if(ans == true){

    			for(int i = 0; i < m; i++) {

    				for(int j = 0; j < n; j++) {
    					
    					if(arr[i][j] == '0' || arr[i][j] == '_'){
    						
    					} else {
    						count = -1;
    					}
    				}
    				
    			}
    			break;
    		}
    		count++;
    	}

    	wr.println(count);
    	


    	// for(int i = 0; i < m; i++) {

    	// 	for(int j = 0; j < n; j++) {
    			
    	// 		wr.print(arr[i][j]);

    	// 	}
    	// 	wr.println();
    	// }
    	// wr.println();



    }

  	  


    wr.flush();
    wr.close();
  }

  public static boolean task1(char[][] arr, int m, int n) {

  		char[][] clone = new char[m][n];

  		for(int i = 0; i < m; i++) {

    		for(int j = 0; j < n; j++) {
    			
    			clone[i][j] = arr[i][j];

    		}
    	}
  
  		for(int i = 0; i < m; i++) {

    		for(int j = 0; j < n; j++) {
    			
    			if(arr[i][j] == '0' || arr[i][j] == '_'){
    				continue;
    			} else {

    				char temp = arr[i][j];
    				temp--;

    				if((j-1)>=0 && (j-1)<n && arr[i][j-1]=='0'){
    					clone[i][j] = temp;
    				}

    				if((j+1)>=0 && (j+1)<n && arr[i][j+1]=='0'){
    					clone[i][j] = temp;
    				}

    				if((i-1)>=0 && (i-1)<m && arr[i-1][j]=='0'){
    					clone[i][j] = temp;
    				}

					if((i+1)>=0 && (i+1)<m && arr[i+1][j]=='0'){
    					clone[i][j] = temp;
    				}    				
    				
    			}

    		}
    		
    	}

    	boolean result = true;

    	for(int i = 0; i < m; i++) {

    		for(int j = 0; j < n; j++) {
    			
    			if(arr[i][j] != clone[i][j]) {
    				arr[i][j] = clone[i][j];
    				result = false;
    			}
    			
    		}
    	}

    	return result;
  	
  }


  // public static boolean task1(int) {
  
  
  // 	return result;
  // }
}