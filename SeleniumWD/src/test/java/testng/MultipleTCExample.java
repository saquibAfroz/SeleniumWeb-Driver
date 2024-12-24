package testng;

import org.testng.annotations.Test;

public class MultipleTCExample extends BaseClass {

	@Test(priority = 1)
	public void TC_02() {
		System.out.println("Inside TC 02");
	}

	@Test(enabled = true, priority = 2)
	public void TC_03() {
		System.out.println("Inside TC 03");
	}

	@Test(priority = 0, groups = { "regression" })
	public void TC_04() {
		System.out.println("Inside TC 04");
	}
}
