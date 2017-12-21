package querytool.actionClasses;

 class TestAbst2 extends TestAbst {
	 void run(){
		 System.out.println("running.....");
	 }
	public static void main(String[] args) {
		TestAbst aa = new TestAbst2();
		aa.run();
		
	}
}
