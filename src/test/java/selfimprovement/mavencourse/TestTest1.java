package selfimprovement.mavencourse;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTest1 {
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	
	}
	
	@Test
	public void Test() {
		
		System.out.println("Actual Test 1");
	
	}
	
	@Test
	public void Test2() {
		
		System.out.println("Actual Test 2");
	
	}
	
	@AfterTest
	public void close() {
		
		System.out.println("After Test");
	
	}
	
	

}
