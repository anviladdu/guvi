/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set7_9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=a-b;
		if(result%2==0)
		{
			System.out.print("even");
		}
		else
		  {
		  	 System.out.print("no");
		  }
	}
}
