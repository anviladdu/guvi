/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Greater
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereString s1, s2;
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      String s2 = in.nextLine();
      if (s1.compareTo(s2) > 0)
       System.out.println(s1);
      else if (s1.compareTo(s2) < 0)
         System.out.println(s2);
      else   
         System.out.println(s1);
	}
}
