// NAme : DHRUV A. NASIT
// ID : 21CE079

// Aim : Given a string, return a string made of the
//       first 2 chars (if present), however include
//       first  char  only  if  it  is  'o' and  
//       include  the  second  only  if  it  is  'z', 
//       so  "ozymandias" yields "oz".
//       startOz("ozymandias") → "oz"
//       startOz("bzoo") → "z"
//       startOz("oxx") → "o"

import java.util.Scanner;
class Practical_2
{
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // defining the stirng
      String scc = sc.nextLine();
      // calling the startOZ function 
      startOZ(scc);
        sc.close();
    }
    // user defined method for startOZ function
    static void startOZ(String scc)
    {
        // logic for the first letter
      if(scc.charAt(0) == 'o' || scc.charAt(0) == 'O')
      {
        System.out.print(scc.charAt(0));
      }
      // logic for the second letter
      if(scc.charAt(1) == 'z' || scc.charAt(1) == 'Z')
      {
        System.out.println(scc.charAt(1));
      }
    }
}