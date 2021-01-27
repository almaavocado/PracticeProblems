import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondInteger;
        double secondDouble;
        String s1;


       /* 
        Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your variables.
Use the  operator to perform the following operations: 
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
        */
        secondInteger = scan.nextInt(); 
        secondDouble = scan.nextDouble(); 
        scan.nextLine();
        s1 = scan.nextLine();
        //string10 = s+""+string1 +" "+ string2 +" "+ string3 +" "+ string4 +" "+ string5 +" "+ string6 +" "+ string7 +" "+string8 +" "+ string9;
   

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInteger);
        /* Print the sum of the double variables on a new line. */
	    System.out.println(d + secondDouble);
	
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + s1);
        scan.close();
    }
}
