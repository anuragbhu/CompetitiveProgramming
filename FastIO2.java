import java.util.*;
import java.io.*;
import java.lang.*;
 
public class FastReaderForGeneral {

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
  
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      wr.println(x+y);
    }
    wr.flush();
    wr.close();
  }
}