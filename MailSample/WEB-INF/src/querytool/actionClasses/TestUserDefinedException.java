package querytool.actionClasses;

 class TestUserDefinedException {
	 static void validate(int age)throws InvalidAgeException{  
		 if(age<18)  
		  throw new InvalidAgeException("Invalid age");
		 else  
		 System.out.println("welcome to vote");  
		}  
	 public static void main(String[] args) {
		 try{  
			 validate(20);  
			 }
			catch(Exception m){
			System.out.println("Exception occured: "+m);
			}
			finally{
			 System.out.println("This block will be Executed");
			}
		}
}
