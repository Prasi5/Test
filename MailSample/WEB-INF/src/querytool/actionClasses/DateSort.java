package querytool.actionClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class DateSort {
	public static void main(String[] args) {
		String dates[] ={"03-11-2012","13-04-1992","7-10-2010"};
		Arrays.sort(dates, new Comparator<String>(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int result= -1;
				try{
					result=sdf.parse(o1).compareTo(sdf.parse(o2));
				}catch (ParseException ex) {
                    ex.printStackTrace();
                }
				return result;
			}
		});	
		 for (String date : dates) {
	            System.out.println(date);
	        }
	}

}
