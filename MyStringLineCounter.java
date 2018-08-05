/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MyStringLineCounter {
 
    public static int getLineCount(String text){
         
        return text.split("[.]").length;
    }
     
    public static void main(String a[]){
     
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count = getLineCount(str);
        System.out.println(count);
	}
}
