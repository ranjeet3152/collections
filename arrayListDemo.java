import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		// this is how elements should be added to array list
		a1.add("hello");
		a1.add("world");
		a1.add("ranjeet");
		a1.add("raj");
		// displaying array list elements
		System.out.println("Currently Array List has following elements:" + a1);
		
		// add elements at given position
		a1.add(0, "rahul");
		a1.add(1,"ranjeet");
		System.out.println("Now Array List has following elements" + a1);
		
		//remove elements from Array list
		a1.remove("rahul");
		a1.remove("ranjeet");
		System.out.println("Now Array List has following elements" + a1);
		
		//remove elements from given index
		a1.remove(1);
		System.out.println("Now Array List has following elements" + a1);
		
		a1.add(3,"rahul");
		System.out.println("Now Array List has following elements" + a1);
		
		}
}
