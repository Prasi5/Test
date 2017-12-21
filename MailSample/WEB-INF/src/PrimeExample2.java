
public class PrimeExample2 {
	public static void main(String[] args) {
		int i= 0;
		int num= 0;
		String primeNUmbers= "";
		 for(i=0;i<100;i++){
			int counter=0;
			for(num=i;num>=1;num--){
				if(i % num ==0){
				counter= counter+1;	
				}
			}
			if(counter ==2){
				if(i % 3==0)
				{

				System.out.println("M");
				}

				if(i% 5==0)
				{

				System.out.println("A");
				}

				if ((i%3==0) &&(i%5==0))
				{

				System.out.println("M and A");
				}
				else
				primeNUmbers = primeNUmbers + i + " ";
				System.out.println(i);
				}
				
			}
			 
		 }
	}

