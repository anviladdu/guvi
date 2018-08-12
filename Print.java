/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Print
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a;
     int b;
     int t;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     t=a;
     a=b;
     b=t;
     System.out.printf("%d ",a);
	}
}
