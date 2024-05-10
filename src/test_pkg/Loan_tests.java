package test_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loan_tests {

	@Parameters({"url"})
	@Test
	public void personal(String weburl)
	{
		System.out.println("personal loan test");
		System.out.println(weburl);
	}
	@Test(dependsOnMethods= {"personal"})
	public void car()
	{
		System.out.println("car loan teests");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}
	@Test(groups={"smoke"})
	public void home()
	{
		System.out.println("home loan tests");
	}
	@Test(enabled=false)
	public void home_smartloan()
	{
		System.out.println("smart home loan tests");
	}
	@BeforeTest
	public void prerequisete()
	{
		System.out.println("execute first");
	}
	@AfterTest
	public void last()
	{
		System.out.println("last execution");
	}
}

