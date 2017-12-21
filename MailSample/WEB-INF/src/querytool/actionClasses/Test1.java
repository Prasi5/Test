package querytool.actionClasses;

public class Test1 {
	public static void main(String [] args){
		/*cat a = new cat();
		System.out.println(a.health);
		dog d= new dog();
		System.out.println(a.health);*/// upcasting
		
		/*cat a = new cat();
		mammal m = a;*/
		 /*mammal m = new cat();
		System.out.println(m.health); */// downcasting
		
		 cat c1 = new cat();		 
			Animal a = c1;		
			System.out.println(a.health);//automatic upcasting to Animal
			cat c2 = (cat) a;
			System.out.println(c2.health);
		 
		
	}
}
