import java.util.*;
import java.lang.*;
import java.io.*; 

class Test {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                boolean result = check(n);

                if(result)
                        System.out.println("Yes");
                else
                        System.out.println("No");
        }

        public static boolean check(int n){

                while(n>0){
                        int rem = n%10;
                        if(rem==7)
                                return true;
                        n/=10;
                }
                return false;
        }
} 
