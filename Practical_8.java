// Name : DHRUV A. NASIT
// ID : 21CE079

// Aim :
// The problem is to write a program that will grade multiple-choice tests. Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array. Each row records a student’s answers to the questions, as shown in the following array.
// Students’ Answers to the Questions:
//            0  1  2  3  4  5  6  7  8  9
// Student 0  A  B  A  C  C  D  E  E  A  D
// Student 1  D  B  A  B  C  A  E  E  A  D
// Student 2  E  D  D  A  C  B  E  E  A  D
// Student 3  C  B  A  E  D  C  E  E  A  D
// Student 4  A  B  D  C  C  D  E  E  A  D
// Student 5  B  B  E  C  C  D  E  E  A  D
// Student 6  B  B  A  C  C  D  E  E  A  D
// Student 7  E  B  E  C  C  D  E  E  A  D
// The key is stored in a one-dimensional array:
// Key to the Questions: 
//     0 1 2 3 4 5 6 7 8 9
// Key D B D C C D A E A D
// Your program grades the test and displays the result. It compares each student’s answers with the key, counts the number of correct answers, and displays it.

import java.util.*;
public class Practical_8 {
    public static void main(String[] args) {
        char[] key = new char[10];
            Scanner scc = new Scanner(System.in);
            // here answer key is variable everytime the program runs
            System.out.println("Enter the ans key : ");
        for(int i =0;i<10;i++)
        {
            key[i] = scc.next().charAt(0);
        }
        // ans key is done
        int n;
        int mks=0,p=0;
        System.out.println("enter the number of the student : ");
        n=scc.nextInt();
        int[] result = new int[n]; 
        char[][] exam = new char[n][10];

        // entering the marks for the students
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<10;j++)
            {
                exam[i][j] = scc.next().charAt(0);
            }
        }
        scc.close();

        // checking the answers of students with the key
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<10;j++)
            {
                if(exam[i][j] == key [j])
                    {
                        mks++;
                    }
            }
            result[p] = mks;
            p++;
            mks =0;
        }
    // result of the students : 
    System.out.println("result of the students : ");
        for(int u=0; u<n; u++)
        {
            System.out.print("result of Student "+(u+1)+" is : ");   
            System.out.println(result[u]+" ");    
        }
    }
}
