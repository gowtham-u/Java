package com.zieta.javaassignmenttwo;

import java.util.Scanner;

public class FibonacciSeriesRecursion {
	
	 public static int fibonacci(int n) {
	        if (n == 0) {
	            return 0;
	        } 
	        else if (n == 1) {
	            return 1;
	        } 
	        else {
	            return fibonacci(n-1) + fibonacci(n-2);
	        }
	    }
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms to display: ");
        int numTerms = scanner.nextInt();

        
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

    
   

