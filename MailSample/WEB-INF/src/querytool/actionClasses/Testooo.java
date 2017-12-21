package querytool.actionClasses;

public class Testooo {
	public static void main(String[] args) throws CloneNotSupportedException{
		AbcCl a1= new AbcCl(1,"helloo");
		AbcCl b =(AbcCl)a1.Clone();
		System.out.println(b.i);
		System.out.println(a1.s);
	}

}
