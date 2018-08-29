/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set8_3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  int a;
         int f=0;
         int b,c;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    for(int i=b;i<=c;i++){
        if(i==a){
             break;
        }
    }
   if(f==1){
       System.out.println("Yes");
   }
 else{
        System.out.println("NO");
 }
	}
}
