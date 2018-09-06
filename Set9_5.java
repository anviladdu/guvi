/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set9_5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		     String v;
       Scanner s=new Scanner(System.in);
       v=s.next();
      String dd="";
      String cc="";
       char a[]=v.toCharArray();
       for(int i=0;i<a.length;i++){
           if(i%2==0){
             dd=dd+a[i];
           }
 else{
               cc=cc+a[i];
 }
       }
       System.out.printf("%s %s", dd,cc);
	}
}
