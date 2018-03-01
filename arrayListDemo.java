//Arraylist with function along
//with junits test cases

package collection;
import java.util.*;
import java.util.ArrayList;
public class arrayListDemo {
	
  public static void main(String[] args) {
	}
	    public ArrayList<String>myArray(){
			ArrayList<String> a1 = new ArrayList<String>();
			// this is how elements should be added to array list
			a1.add("a");
			a1.add("b");
			a1.add("c");
			a1.add("d");
			return a1;
	    }
	    public ArrayList<Integer>myArray1(){
	    	ArrayList<Integer> a2 = new ArrayList<Integer>();
	    	a2.add(2);
	    	a2.add(5);
	    	a2.add(3);
	    	a2.add(1);
	    	Collections.sort(a2);
	    	return a2 ;	    	
	    }
	    public ArrayList<String>myArray2(){
	    	ArrayList<String> a3 = new ArrayList<String>();
	    	a3.add("ranjeet");
	    	a3.remove("ranjeet");
	    	return a3 ;
	    }
}	
		



