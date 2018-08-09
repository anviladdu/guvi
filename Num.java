/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ss=new Scanner(System.in);
		int i=ss.nextInt();
		switch(i){
			case 1:if(i<=10)
			           System.out.println("yes");
			           break;
			case 2:if(i<0)
			           System.out.println("no");
			           break;
			default:;
		}
	}
}
