
public class StaticClassObjectCreations {
	
	 public static void doSomeThing() {
	        System.out.println("here");
	    }
	 public void doAfter(){
		 System.out.println("there");
	 }
	 	{
	   		 int a= 10;
	   		 System.out.println(a);
	   	 }
	 
	    public static void main(String[] args) {
	        StaticClassObjectCreations obj = null;
	        obj.doSomeThing();
	        StaticClassObjectCreations obj1 = new StaticClassObjectCreations();
	        StaticClassObjectCreations obj2= null;
	        obj2=obj1;
	        obj2.doAfter();
	        StaticClassObjectCreations.doSomeThing();
	      
	   	 
	        
	    }


}
