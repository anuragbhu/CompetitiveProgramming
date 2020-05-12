import java.util.*;
import java.io.*;
import java.lang.*;
 
class Test {

  static class Reader {

    final private int BUFFER_SIZE = 1 << 16; 
    private DataInputStream din; 
    private byte[] buffer; 
    private int bufferPointer, bytesRead; 

    public Reader() { 
      din = new DataInputStream(System.in); 
      buffer = new byte[BUFFER_SIZE]; 
      bufferPointer = bytesRead = 0; 
    } 

    public Reader(String file_name) throws IOException { 
      din = new DataInputStream(new FileInputStream(file_name)); 
      buffer = new byte[BUFFER_SIZE]; 
      bufferPointer = bytesRead = 0; 
    } 

    public String readLine() throws IOException { 
      byte[] buf = new byte[64]; // line length 
      int cnt = 0, c; 
      while ((c = read()) != -1) { 
        if (c == '\n') 
          break; 
        buf[cnt++] = (byte) c; 
      } 
      return new String(buf, 0, cnt); 
    } 

    public int nextInt() throws IOException { 
      int ret = 0; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 
      do { 
        ret = ret * 10 + c - '0'; 
      } while ((c = read()) >= '0' && c <= '9'); 

      if (neg) 
        return -ret; 
      return ret; 
    } 

    public long nextLong() throws IOException { 
      long ret = 0; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 
      do { 
        ret = ret * 10 + c - '0'; 
      } 
      while ((c = read()) >= '0' && c <= '9'); 
      if (neg) 
        return -ret; 
      return ret; 
    } 

    public double nextDouble() throws IOException { 
      double ret = 0, div = 1; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 

      do { 
        ret = ret * 10 + c - '0'; 
      } 
      while ((c = read()) >= '0' && c <= '9'); 

      if (c == '.') { 
        while ((c = read()) >= '0' && c <= '9') { 
          ret += (c - '0') / (div *= 10); 
        } 
      } 

      if (neg) 
        return -ret; 
      return ret; 
    } 

    private void fillBuffer() throws IOException { 
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
      if (bytesRead == -1) 
        buffer[0] = -1; 
    } 

    private byte read() throws IOException { 
      if (bufferPointer == bytesRead) 
        fillBuffer(); 
      return buffer[bufferPointer++]; 
    } 

    public void close() throws IOException { 
      if (din == null) 
        return; 
      din.close(); 
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
  
    Reader sc = new Reader();
    PrintWriter wr = new PrintWriter(System.out);

    int t = 1;
    t = sc.nextInt();    //Comment this line if there is single test case

    while((t--) != 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int[] clone = arr.clone();
      Arrays.sort(clone);

      int p = m * 2;
      int[] pair = new int[p];

      for(int i = 0; i < p; i++) {
         pair[i] = sc.nextInt();
      }

      // even = key
      // odd = val

      int count = 0, key = 0, val = 0, p1 = 0, p2 = 0;
      boolean check = false;
      for(int i = 0; i < n; i++) {
        if(Arrays.equals(arr, clone)){
          break;
        } else if(arr[i] != clone[i]){
          key = clone[i];
          val = index(arr, key);

          p1 = arr[i];
          p2++;

          if(verify(pair, i, val)){
            count++;
          }

          p1 = arr[i];
          arr[i] = arr[val];
          arr[val] = p1;
        }


      }
      wr.println(p2); 
      wr.println(count); 
    }
    wr.flush();
    wr.close();
  }

  public static int index(int[] arr, int key) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == key){
        return i;
      }
    }
    return -1;
  }

  public static boolean verify(int[] pair, int x, int y){
    x++; y++;
    // System.out.println(p1);
    // System.out.println(p2);
    int i = 0;
    for(i = 0; i < pair.length; i=i+2) {
      if(pair[i] == x && pair[i+1] == y){
        return true;
      } else if(pair[i] == y && pair[i+1] == x){
        return true;
      }
    }
    // System.out.println(i);
    // System.out.println();
    return false;
  }
}