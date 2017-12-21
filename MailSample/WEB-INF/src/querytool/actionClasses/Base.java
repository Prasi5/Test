package querytool.actionClasses;

/**
 * 
 * @author scii359
 *
 */
class Base {
	
	void foo(){
		System.out.println("foo ver 1 from class Base");
		}
    final void foo(int a){ 
    	System.out.println("foo ver 2 from class Base"); 
    	}
     
     final void foo(int a,String b){
    	 System.out.println(a+"b");
     }
}
