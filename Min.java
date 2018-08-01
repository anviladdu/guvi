/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Min
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int hours = t / 60; //since both are ints, you get an int
        int minutes = t % 60;
        System.out.printf("%d%2d", hours, minutes);
	}
}
