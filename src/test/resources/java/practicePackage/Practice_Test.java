package practicePackage;

import org.testng.annotations.Test;

public class Practice_Test {

	@Test(groups="smoke")
	public void sampleMaven_1Test() {
		System.out.println("----maven TestScript 1--");
	}
	@Test(groups="regression")
	public void sampleMaven_2Test() {
		System.out.println("----maven TestScript 2--");
	}
	
}
