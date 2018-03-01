//Junit test cases for all the function
//of arrayListDemoTest

package collection;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class arrayListDemoTest {
	// run once before all the test 
	  @BeforeClass
	    public static void runOnceBeforeClass() {
	        System.out.println("@BeforeClass - runOnceBeforeClass");
	    } 
	// run before @test
	  @Before
	    public void runBeforeTestMethod() {
	        System.out.println("@Before - runBeforeTestMethod");
	    }
  //this is the the method to run
	@Test
	public void testMyArray() {
		arrayListDemo testcases = new arrayListDemo();
		assertEquals(Arrays.asList("a" , "b" , "c" , "d" ) ,testcases.myArray());
	}
	@Test
	public void testMyArray1(){
		System.out.print("testcase");
		arrayListDemo testcases = new arrayListDemo();
		assertEquals(Arrays.asList(1, 2 , 3 , 5 ) ,testcases.myArray1());
		
	}
	@Test
	public void testMyArray2(){
		arrayListDemo testcases = new arrayListDemo();
		assertEquals(0,testcases.myArray2().size());
	}
	// run after @test
	  @After
	    public void runAfterTestMethod() {
	        System.out.println("@After - runAfterTestMethod");
	    }
	 // run once after all the test case
	 @AfterClass
	    public static void runOnceAfterClass() {
	        System.out.println("@AfterClass - runOnceAfterClass");
	    }

}
