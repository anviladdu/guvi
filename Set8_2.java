/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set8_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s;
char c;
int i,j=0,cnt;
cnt=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
s=br.readLine();
for(i=0;i<=j;i++)
{
c=s.charAt(i);
if(c=='a'||c=='A'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'||c=='e'||c=='E')
{
cnt++;
System.out.print("yes");
}
else
   {
   	 System.out.print("no");
   }
	}
}
}
