/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set7_1
{
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 String a;
     Scanner s=new Scanner(System.in);
     a=s.nextLine();
     String h[]=a.split("\\;");
     for(int i=0;i<h.length;i++){
         System.out.printf("%s ",h[i]);
	}
	}
}
