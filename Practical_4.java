// Name : DHRUV A. NASIT
// ID : 21CE079

// Aim : 
// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true


import java.util.*;
public class Practical_4 {
    // main method
    public static void main(String[] args) {
        Scanner scc = new Scanner (System.in);
        int n = scc.nextInt();
        int[] a = new int[n];
        // her entries for the array
        for(int i=0;i<n;i++)
        {
            a[i] = scc.nextInt();
        }
        // check if 1,2,3 sequence exist or not
        for(int i=0;i<n-2;i++)
        {
            if (a[i] == 1 && a[i+1] == 2 && a[i+2] == 3)
            {
                System.out.println("true");
            }
            scc.close();
        }
    }
}
