package querytool.actionClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CheckDate {
	public static void main(String[] args) throws ParseException {
		/*java.util.Date date1 = new java.util.Date();
		  System.out.println("Hello World! "+ date1);
		  
		  java.sql.Date date2 = new java.sql.Date(date1.getTime());
		  System.out.println("Hello World! "+ date2);*/
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the dob");
        String dob=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yy");
        java.util.Date ud=sdf.parse(dob);
        long msdob=ud.getTime();//according to the echo standrard since jan 1970 it counts to till date and gives the difference
        java.sql.Date sqdob=new java.sql.Date(msdob);
        System.out.println(sqdob);
	}

}
