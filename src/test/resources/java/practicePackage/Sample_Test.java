package practicePackage;

import org.testng.annotations.Test;

public class Sample_Test {
	
	@Test(groups="regression")
	public void sampleMaven_5Test() {
		System.out.println("----maven TestScript 5--");
	}	
	
	@Test(groups="smoke")
	public void sampleMaven_6Test() {
		System.out.println("----maven TestScript 6--");
	}
}
