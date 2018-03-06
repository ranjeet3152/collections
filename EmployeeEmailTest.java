// complete test class and use the following assertions:
//assertEquals and assertNotEquals
//assertNull and assertNotNull
//asserSame And assertNot Same.


import static org.junit.Assert.*;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeEmailTest {
   //run once before all test  class
	@BeforeClass
	public static void runOnceBeforeClass(){
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}
	//run before @Test
	@Before
	public void runBeforeTestClass(){
		System.out.println("@Before - runBeforeTestMethod");
	}
	@Test
	public void testValidEmailId() throws Exception{
		//Arrange
		EmployeeEmail empMail = new EmployeeEmail();
		//Act
		boolean result = empMail.isValidEmailId("ranjeet3152@gmail.com");
		//Assert
		assertTrue ("Valid Email Id Failed" , result);
	}
  
	@Test
    public void testInValidEmailId() throws Exception{
	//Arrange
		EmployeeEmail empMail = new EmployeeEmail() ;
	//Act
	boolean result = empMail.isValidEmailId("ranjeet@gmail");
	//Assert
	assertFalse("Invalid Email Id Passed" , result);
	}
	
  @Test
	public void testAddEmailId() throws Exception{
		//Arrange
		EmployeeEmail empMail = new EmployeeEmail();
		empMail.addEmployeeEmailId("Emp01", "raj.nitsxr@yahoo.com");
		empMail.addEmployeeEmailId("Emp02", "ranjeetraj3152@gmail.com");
		//Act
		int size = empMail.hashMap.size();
		//Assert
		assertEquals("Incorrect Collections Size" , 2 , size);
	}
	
	@Test
	public void testAddEmailIdWithDuplicateKey() throws Exception{
		//Arrange
		EmployeeEmail empMail = new EmployeeEmail();
		empMail.addEmployeeEmailId("Emp01", "raj.nitsxr@yahoo.com");
		empMail.addEmployeeEmailId("Emp02", "ranjeetraj3152@gmail.com");
		empMail.addEmployeeEmailId("Emp02", "abc@gmail.com");
		//Act
		int size = empMail.hashMap.size();
		//Assert
		assertNotEquals("Incorrect Collections Size" , 3 , size);
	}
	
	@Test
	public void testGetExistingEmailId() throws Exception{
		//Arrange
		EmployeeEmail  empEmail = new EmployeeEmail();
		empEmail.addEmployeeEmailId("Emp01", "xyz@gmail.com");
		empEmail.addEmployeeEmailId("Emp02" , "raj@gmail.com");
		//Act
		String val = empEmail.getEmployeeEmailId("Emp02");
		//Assert
		assertNotNull("Returned null for existing employee" , val);
	}
	
	@Test
	public void testGetNonExistingEmailId() throws Exception{
		//Arrange
		EmployeeEmail  empEmail = new EmployeeEmail();
		empEmail.addEmployeeEmailId("Emp01", "xyz@gmail.com");
		empEmail.addEmployeeEmailId("Emp02" , "raj@gmail.com");
		//Act
		String val = empEmail.getEmployeeEmailId("Emp05");
		//Assert
		assertNull("Returned null for existing employee" , val);
	}
	
	@Test
	public void testIfObjectsAreSame() throws Exception{
		//Arrange
		EmployeeEmail empEmail1 = new EmployeeEmail() ;
		empEmail1.addEmployeeEmailId("Emp01" , "abc@yahoo.com");
		EmployeeEmail empEmail2 = new EmployeeEmail() ;
		empEmail2.addEmployeeEmailId("Emp02" , "xyz@yahoo.com");
		//Act
		Map map1 = empEmail1.hashMap;
		Map map2 = empEmail2.hashMap;
		map1 = map2 ;
		//Assert
		assertSame("Failed because objects are not same" , map1, map2);
	}
	
	@Test
	public void testIfObjectsAreNotSame() throws Exception{
		//Arrange
		EmployeeEmail empEmail1 = new EmployeeEmail() ;
		empEmail1.addEmployeeEmailId("Emp01" , "abc@yahoo.com");
		EmployeeEmail empEmail2 = new EmployeeEmail() ;
		empEmail2.addEmployeeEmailId("Emp02" , "xyz@yahoo.com");
		//Act
		Map map1 = empEmail1.hashMap;
		Map map2 = empEmail2.hashMap;
		//Assert
		assertNotSame("Failed because objects are not same" , map1, map2);
	}
	//run after test method
	@After
	public void runAfterTestMethod(){
		System.out.println("@After - runAfterTestmethod");
	}
	// run once after all the test cases
	@AfterClass
	public static void runOnceAfterClass(){
		System.out.println("@AfterClass - runOnceAfterClass");
	}
}
