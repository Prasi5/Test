package querytool.actionClasses;

public class StringToHexa {
	public static void main(String[] args){
		final int hexBase = 16;
		StringBuffer buffer = new StringBuffer();
		StringBuilder str = new StringBuilder("India ");
		int a = 100;
		int c = Integer.parseInt("42", 16);
		System.out.println(c);
		String v = Integer.toString(100);
		System.out.println(v);
		
		/*int intValue,
		quotient = 0, 
		reminder = 0;
		String Hex = null;
		for(int x = 0; x < str.length(); x++){
			intValue = str.charAt(x);
			System.out.println(intValue);
			char vv = str.charAt(x);
			reminder = intValue % hexBase;
			System.out.println(reminder);
			quotient = intValue / hexBase;
			Hex = Integer.toString(reminder).concat(Integer.toString(quotient));
			buffer.append(Hex);
			System.out.println(buffer);
		}*/
	}

}
