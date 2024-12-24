package testng;

import org.testng.annotations.Test;

public class OneTCExample extends BaseClass {

	@Test(groups = { "regression", }) // { "regression","smoke"})
	public void TC_01() {
		System.out.println("Inside TC01");
	}
}
