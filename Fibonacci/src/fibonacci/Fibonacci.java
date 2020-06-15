package fibonacci;

/* @author kristen lane
 * iterative and recursive fibonacci sequence
 */

import java.util.Scanner;

public class Fibonacci {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the number you want to find in the Fibonacci sequence: ");
        
        int n = sc.nextInt();
        
        long startTime = System.nanoTime(); 
        System.out.print("\nThe number at index " + n +" is: "+ recursiveFib(n));
        System.out.print("\nTime spent (in nanoseconds) using a recursive method: " + (System.nanoTime() - startTime) + "ns\n");

        startTime = System.nanoTime(); 
        System.out.print("\nThe number at index " + n +" is: "+ iterativeFib(n));
        System.out.print("\nTime spent (in nanoseconds) using an iterative method: " + (System.nanoTime() - startTime) + "ns\n"); 
    }
        
    
    public static int recursiveFib(int n) {
        if ((n==0) || (n==1))
        return n;
        return (recursiveFib(n-1) + recursiveFib(n-2));
    }

    
    public static int iterativeFib(int n) {
        int a = 0, b = 1, c = 1; 
        int i;

        if ((n== 0) || (n == 1))
            return n;

        for (i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return a;
    }
         
}



    

        

