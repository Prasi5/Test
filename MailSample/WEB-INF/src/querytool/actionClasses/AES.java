package querytool.actionClasses;
 class AES extends Shapee {
	 int length,width;
	 

	AES(int length, int width, String name) {
		super(name);
		this.length=length;
		this.length=width;
		
	}
	
	
	

	@Override
	public void drawing() {
		 System.out.println("Rectangle has been drawn "); 
	}

	@Override
	public double area() {
		 return (double)(length*width);
	}
}
