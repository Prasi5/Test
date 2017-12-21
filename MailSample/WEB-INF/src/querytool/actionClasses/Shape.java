package querytool.actionClasses;

public abstract class Shape {
	 Shape(){
		 System.out.println(" Shape is Created");
	 }
	abstract void draw();
	void changeGear(){System.out.println("gear changed");} 
}
