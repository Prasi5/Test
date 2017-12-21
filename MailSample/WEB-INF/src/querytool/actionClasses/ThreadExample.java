package querytool.actionClasses;

public class ThreadExample {
public static void main(String[] args) throws InterruptedException {
	final Pc pc = new Pc();
	Thread t1 = new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
            {
                pc.Produce();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
		}
		
	});
	
	 Thread t2 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 pc.Consumer();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
     });
	t1.start();
	t2.start();
	
	t1.join();
    t2.join();
}
}
