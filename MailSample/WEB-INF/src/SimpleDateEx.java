import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateEx {
	public static void main(String[] args) {
		String Datestr = "1:35:29 AM";
		DateFormat readFormat = new SimpleDateFormat("hh:mm:ss aa");
		DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try{
			 date = readFormat.parse(Datestr);
		}catch(Exception e){
			e.printStackTrace();
		}
		if (date != null) {
		    String formattedDate = writeFormat.format(date);
		    System.out.println(formattedDate);
		}
	}
	

}
