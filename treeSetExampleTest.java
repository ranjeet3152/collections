//Junit test case for treeSetExample

package collection;

import static org.junit.Assert.*;

import java.util.Arrays;

//import junit.framework.Assert;

import java.util.TreeSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class treeSetExampleTest {
	// run once before all the test
	@BeforeClass
	public static void runOnceBeforeClass(){
		System.out.println("@BeforeClass-runOnceBeforeClass");
	}
	// run before test class
   @Before
	    public void runBeforeTestMethod() {
	        System.out.println("@Before - runBeforeTestMethod");
	    }
   // this is the mathod to run
	@Test
	public void testTreeSet() {
		treeSetExample testcases = new treeSetExample();
	TreeSet<String> result = testcases.treeSet("a","b","c","d");
	assertEquals("a","b","c","d", result);
	}
  
	private void assertEquals(int i, int j, int k,
			int l, TreeSet<String> result) {
			
	}
	private void assertEquals(String string, String string2, String string3,
			String string4, TreeSet<String> result) {
		}

  @Test
   public void testmyArray1(){
    	System.out.print("@Test - method to run");
   	treeSetExample testcase = new treeSetExample();
  TreeSet results1 = testcase.treeSet1();
  	assertEquals(4,8,10,34 , results1);     	
    }
 
  // run after @test
  
  @After
  public void runAfterTestMethod(){
	  System.out.println("@After - runAfterTestClass");
  }
  // run once after all the test class
  @AfterClass
  public static void runOnceAfterClass(){
	  System.out.println("@AfterClass - runOnceAfterClass");
  }
  }
