package querytool.actionClasses;

public class D{
	public static void main(String[] args){
		int k =55;
		try{
			k=k/0;
		}catch(ArithmeticException e){
			System.out.println("dividing but zero caught");
		}finally{
			System.out.println("excecutes");
		}
	}

}
