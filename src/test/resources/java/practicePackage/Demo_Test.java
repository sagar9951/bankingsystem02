package practicePackage;

import org.testng.annotations.Test;

public class Demo_Test {
	
	@Test(groups="smoke")
	public void sampleMaven_3Test() {
		System.out.println("----maven TestScript 3--");
	}
	@Test(groups="regression")
	public void sampleMaven_4Test() {
		System.out.println("----maven TestScript 4--");
	}

}
