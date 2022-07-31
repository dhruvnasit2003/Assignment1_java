// Name :DHRUV A. NASIT
// ID : 21CE079

// Aim : 
// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

import java.util.*;
import static java.lang.Math.min;
public class Practical_5 
{
    //main method
    public static void main(String[] args) 
    {
        // entering the strings
        Scanner scc = new Scanner(System.in);
        System.out.println("string 1 : ");
        String a = scc.next();
        System.out.println("string 2 : ");
        String b = scc.next();
        // calling the method matched
        int m = matched(a, b);
        System.out.println(m);
        scc.close();
    }

    public static int matched(String a, String b) 
    {
        int count = 0;
        // finding the minimum length from the both of string
        int minimum = min(a.length(), b.length());
        for (int i = 0; i < (minimum - 1); i++) 
        {
            String p = a.substring(i, i + 2);
            String q = b.substring(i, i + 2);

            if (p.equals(q)) 
            {
                count++;
            }
        }
        return count;
    }
}