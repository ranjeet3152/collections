// This program demonstrates how CopyOnWriteArrayList works.

package lesson2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		
		new WriteThread("writer" , list).start();
		new ReadThread("Reader" , list).start();
	}
}
class WriteThread extends Thread{
	private List<Integer>list ;
	public WriteThread(String name , List<Integer>list){
		this.list = list;
		super.setName(name);
	}
		public void run() {
			int count = 6 ;
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.add(count++);
				System.out.println(super.getName()  + "execute only one thread once");
		 }
	}
}
class ReadThread extends Thread{
	private List<Integer>list;
	public ReadThread(String name , List<Integer>list){
		this.list = list ;
		super.setName(name);
	}
		public void run() {
		while(true){
			String output = "\n" + super.getName() + " " ;
			Iterator<Integer>iterator = list.iterator() ; 
			while(iterator.hasNext()){
				Integer next = iterator.next();
				output += " " + next ;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
 					e.printStackTrace();
				}
			}
			System.out.println(output);
		}
   }
	}
