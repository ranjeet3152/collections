package collection;
import java.util.*;
import java.io.*;

public class mapsDemo {

	public static void main(String[] args) {
         //declare hashmap 
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		// check whether the given hashmap is empty or  not
		 System.out.println("Is HashMap Empty? "+hmap.isEmpty());
		 
		 /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      
	    /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      System.out.println("Is HashMap Empty? "+hmap.isEmpty());
	      
	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	          }
	          //size() returns the size of the link list
	          System.out.print("size of hashmap:" + hmap.size());
	          
	          //removing key and value of this map by using key 7
	          Object removeElement = hmap.remove(7);
	          System.out.println("\nelemets removed :" + removeElement);
	          
	          //clear() removes all the key and value from the map
	        //  hmap.clear();
	        //  System.out.println("hashmap elements are:" + hmap);
	          
	          System.out.println("Is HashMap Empty? "+hmap.isEmpty());
	          
	          // to check if a particular key exists in a hashmap or not
	          // it returns a boolean value
	          boolean flag = hmap.containsKey(50);
	          System.out.println("key 50 exists in hashmap ? " + flag);
	          boolean flag1 = hmap.containsKey(49);
	          System.out.println("key 49 exists in hashmap ? " + flag1);
	          
	          // to check if a particular value is present in hashmap or not
	          boolean flag2 = hmap.containsValue("sachin");
	          System.out.println("string sachin exists in hashmap ? " + flag2);
	          boolean flag3 = hmap.containsValue("Rahul");
	          System.out.println("string rahul exists in hashmap ? " + flag3);         
	}
 }
