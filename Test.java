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
  
    //   int x = sc.nextInt();
    //   int y = sc.nextInt();
      
    //   wr.println(x+y);
    // }


    String str = sc.nextLine();

    char[] ch = str.toCharArray();
    int count = 1, check = 1;
    char test = ch[0];

    for(int i = 1; i < ch.length; i++) {
      // test = ch[i];

      if(ch[i] == test){
        check++;
      } else {
        test = ch[i];
        check = 1;
      }
      if(check > count){
        count = check;
      }
    }
    
    wr.println(count);

    wr.flush();
    wr.close();
  }
}