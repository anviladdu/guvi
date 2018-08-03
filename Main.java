/* package whatever; // don't place package name! */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class Main {
	public static void main(String[] args) throws Exception{
	            Scanner sc=new Scanner(System.in);
	            String time1=sc.nextLine();
	            String time2=sc.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
	         try{
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		System.out.println(difference/1000);
	         } catch(ParseException e){
	            e.printStackTrace();
	         }
	            
	}
}
