package querytool.actionClasses;

/**
 * 
 * @author scii359
 *
 */
public class Circle1 extends Shape{
	void draw(){
		System.out.println("drawing Circle");
	}
 public static void main(String[] args){
	Shape s = new Circle1();
	s.draw();
 } 

}
