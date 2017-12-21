package querytool.actionClasses;

abstract class Shapee {
abstract public void drawing();
abstract public double area();
String objectName = " ";
Shapee(String name){
	this.objectName =name;
}

	public void AddParam(int x, int y){
	 System.out.println(this.objectName + " " + "has been moved to"
             + " x = " + x + " and y = " + y);
	
	}
}
