/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibbo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1;
		for(int i=0;i<n;i++)
		  {
		  	System.out.print(a+" ");
		  	int c=a+b;
		  	a=b;
		  	b=c;
		  	
		  }
	}
}
