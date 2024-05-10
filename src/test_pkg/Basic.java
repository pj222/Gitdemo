package test_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic {

	@BeforeMethod
	public void b4method()
	{
		System.out.println("b4method");

	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");

	}
@Parameters({"url"})	
@Test(groups={"smoke"})
	public void demo(String site)
	{
		System.out.println("hello");
		System.out.println(site);

	}
@BeforeSuite
public void b4suit()
{
	System.out.println("b4suit");

}
@AfterSuite
public void aftersuit()
{
	System.out.println("aftersuit");

}
@Test
public void demo2()
{
	System.out.println("hi");
}
@BeforeTest
public void b4test()
{
	System.out.println("b4test");
}
@Test
public void demo3()
{
	System.out.println("hiiiii");
}
@Test
public void demo7()
{
	System.out.println("hiiii");
}
}
