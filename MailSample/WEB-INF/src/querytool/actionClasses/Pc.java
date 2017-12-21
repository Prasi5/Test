package querytool.actionClasses;

import java.util.LinkedList;

public class Pc {
	LinkedList<Integer> list = new LinkedList<>();
	int Capacity= 2;
	public void Produce() throws InterruptedException{
		int value= 0;
		while(true){
			synchronized(this){
				while(list.size()== Capacity){
					  System.out.println("Producer produced-"
                              + value);
					  list.add(value++);
					  notify();
					  Thread.sleep(1000);
				}
			}
		}
	}
	public void Consumer() throws InterruptedException{
	while(true){
		synchronized(this){
			while(list.size()== 0){
				wait();
				int val =list.removeFirst();
				 System.out.println("Consumer consumed-"
                         + val);
				 notify();
                 Thread.sleep(1000);
				}
			}
		}
		
	}
}
