/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here


	            	Scanner input = new Scanner(System.in);
                                    int firstTerm= 0;
                                    int numberOfTerms = 0;
                                    int nthTerm = 0;
                                    int commonDifference = 0;
                                    int  sum= 0;
                                    int term = 0;
                                    numberOfTerms = input.nextInt();
                                    commonDifference = input.nextInt();
                                    firstTerm = input.nextInt();
                                    sum = numberOfTerms * (2 * firstTerm + (numberOfTerms - 1) * commonDifference)/2;
                                       for(int i = 0; i < numberOfTerms; i++)
                                        {
                                           term = firstTerm + i * commonDifference;
                                        }
                                           System.out.println(sum);
	}

	
}
