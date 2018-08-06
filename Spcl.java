/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Spcl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	            int fullLength = s.length();
		String modifiedString = s.replaceAll("\\p{Punct}","");
		int modStringLength = modifiedString.length();
		int numberOfSpecialChars = fullLength - modStringLength;
		System.out.println(numberOfSpecialChars);
	}
}
