import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

/*

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird */


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String output = "";
    
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        if(N % 2 == 1){
            output = "Weird";     
        }
        
        else{
            if(N >= 2 && N <= 5){
                output = "Not Weird";               
            }
            
            else if(N >= 6 && N <=20){
                output = "Weird";               
          
            }
            else if(N > 20){
                output = "Not Weird";               
            }
        }
        System.out.print(output);
    }
}
