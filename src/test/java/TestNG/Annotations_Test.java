package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Test {

		@Test
		public void config_T() {
			System.out.println("@Test");
		}
		
		@AfterTest
		public void config_At() {
			System.out.println("@AfterTest");
		}
		
		@BeforeTest
		public void config_Bt() {
			System.out.println("@BeforeTest");
		}
		
		@BeforeClass
		public void config_BC() {
			System.out.println("@BeforeClass");
		}
		
		@BeforeClass
		public void config_BC2() {
			System.out.println("@BeforeClass2");
		}
		
		@AfterSuite
		public void config_AS() {
			System.out.println("@AfterSuite");
		}
		
		@BeforeSuite
		public void config_BS() {   
			System.out.println("@BeforeSuite");
		}
		
		@BeforeMethod
		public void config_BM() {
			System.out.println("@BeforeMethod");
		}
		
		
		@AfterMethod
		public void config_AM() {
			System.out.println("@AfterMethod");
		}
		
		@AfterMethod
		public void config_AM2() {
			System.out.println("@AfterMethod2");
		}
		
		@AfterClass
		public void config_AC() {
			System.out.println("@AfterClass");
		}
		
		@Test
		public void config_T2() {
			System.out.println("@Test2");
		}
		
}
