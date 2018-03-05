//some of the basic operations
//of the TreeSet.

package collection;
import java.util.TreeSet;
public class treeSetExample {

	public TreeSet<String>treeSet(String string, String string2, String string3, String string4){
	TreeSet<String> tset = new TreeSet<String>();
	tset.add("b");
	tset.add("a");
	tset.add("d");
	tset.add("c");
    tset.add("c");
	return tset;
 }
	public TreeSet<Integer>treeSet1(){
		TreeSet<Integer>tset = new TreeSet<Integer>();
		tset.add(4);
	    tset.add(8);
		tset.add(10);
		tset.add(34);
        return tset;
	}
	
}
