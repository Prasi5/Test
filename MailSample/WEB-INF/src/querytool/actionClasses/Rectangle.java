package querytool.actionClasses;

public class Rectangle extends Shape{ 
	void draw(){
		System.out.println("drawing rectangle");
	}  
	public static void main(String[] args){
		Shape s = new Rectangle();
		s.changeGear();
		s.draw();
	 } 

}
