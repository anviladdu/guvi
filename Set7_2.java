/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set7_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  String d;
     int n=1;;
     Scanner s=new Scanner(System.in);
     d=s.next();
     char a[]=d.toCharArray();
     for(int i=0;i<a.length;i++){
       if(a[i]!='0'&&a[i]!='1'){
           n=0;
           break;
       }
         }

       if(n==0){
          System.out.println("No");
       }
 else{
      System.out.println("Yes");
 }

	}
}
