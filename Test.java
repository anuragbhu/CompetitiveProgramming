import java.util.*;
import java.io.*;
import java.lang.*;
 
class Test {

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
    
    // try {
    //   FileOutputStream output = new FileOutputStream("temp.out");
    //   PrintStream out = new PrintStream(output);
    //   //Diverting the output stream into file "temp.out".Comment the below line to use console
    //   System.setOut(out);
  
    //   InputStream input = new FileInputStream("temp.in");
    //   //Diverting the input stream into file "temp.in".Comment the below line to use console
    //   System.setIn(input);
  
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // }
  
    FastReader sc = new FastReader();
    PrintWriter wr = new PrintWriter(System.out);
 
    // int t = 1;
    // t = sc.nextInt();    //Comment this line if there is single test case
    
    // while((t--) != 0) {


      
    // }

    String s = sc.nextLine();
    String t = sc.nextLine();

    int count = 0;

    for(int i = 0; i < s.length(); i++) {
      
      if(s.charAt(i) != t.charAt(i))
        count++;
    }

    wr.println(count);




    // while((t--) != 0) {
      
    //   int n = sc.nextInt();
      
    //   int result = (int)(Math.log(n) / Math.log(2));
      
    //   wr.println(result+1);
      
    // }
    // How to calculate log base 2 in java


    int t = 1;
    t = sc.nextInt();    //Comment this line if there is single test case
    
    while((t--) != 0) {

      int n = sc.nextInt();
      int e = 0, o = 0;

      for(int i = 0; i < n; i++) {
        
        int x = sc.nextInt();

        if((x % 2) != (i % 2)){
          if(i % 2 != 0) e++;
          else o++;
        }
      }

      if(e == o) wr.println(e);
      else wr.println(-1);
    }

    NO need to create array or such data structure for set of similar items. You can
    store it in variable for each iteration to perform operation.

    Do that much operation according to given sample output. There is no such straight 
    strategy what are written in story. It's a myth.

    Do more problems of much weight.
    Like H, G, F, E etc.

    number theory
    brute force
    some standard

    while((t--) != 0){


    }

    
    wr.flush();
    wr.close();
  }
}