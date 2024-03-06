package TestNG;

import org.testng.annotations.Test;

public class PracticeTestNG_test {
	
	@Test(dependsOnMethods = "deleteTest")
	public void createTest()
	{
		System.out.println("--create test----");
	}
	
	@Test(priority = 1,invocationCount = 0)
	public void editTest() {
		System.out.println("--edit test----");
	}
	
	@Test()
	public void deleteTest() {
		int[] a= {1,2,3,4};
		System.out.println(a[3]);
		System.out.println("--delete test----");
	}
	
	
	
}
