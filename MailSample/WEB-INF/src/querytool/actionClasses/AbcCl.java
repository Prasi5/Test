package querytool.actionClasses;

public class AbcCl implements Cloneable{
int i;
String s;
	public AbcCl(int i, String s){
		this.i=i;
		this.s=s;
	}
	protected Object Clone() throws CloneNotSupportedException{
		return  super.clone();
	}
}
