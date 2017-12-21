package querytool.actionClasses;

public class PrintPrime {
	public static void main(String[] args){
		/*for (int i = 1; i < 100; i++) {
            // Set this to true when one of the special conditions is met.
            boolean printed = false; 

            if (i % 2 == 0) {
                // When i is divisible by 3, then print "Fizz"
                printed = true;
                System.out.print("fuzz");
            } else if (i % 3 == 0) {
                // When i is not divisible by 3 but is divisible by 5, then print "Buzz"
                printed = true;
                System.out.print("bizzz");
            }else if (i % 5 == 0) {
                // When i is not divisible by 3 but is divisible by 5, then print "Buzz"
                printed = true;
                System.out.print("fuzzBizz");
            }

            if (Integer.valueOf(i).toString().indexOf("3") != -1) {
                // When i has the digit 3 in it, then print "Bizz"
                printed = true;
                System.out.print("Bizz");
            } else if (Integer.valueOf(i).toString().indexOf("5") != -1) {
                // When i has the digit 5 in it, then print "Fuzz"
                printed = true;
                System.out.print("Fuzz");
            }

            if (printed == false) {
                // The number does not satisfy any of the special conditions above.
                System.out.print(i);
            }
            System.out.println();
        }*/
		
		
		int num = 100;
        for (int i = 1; i < num; i++)
        {
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0) sb.append("Fizz");
            if(i % 5 == 0) sb.append("Buzz");
           System.out.println(Integer.valueOf(i)); 
           /* if (sb.length() == 0) System.out.print(i);
            else System.out.print(sb);
            System.out.println();*/
        }
		 }
	}


