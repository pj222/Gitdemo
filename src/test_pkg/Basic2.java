package test_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic2 {
@Test(groups={"smoke"})
public void demo3()
{
	System.out.println("hey there");
}
@Test(dataProvider="getdata")
public void demo4(String user,String pwd)
{
	System.out.println(user);
	System.out.println(pwd);
}
@DataProvider
public Object getdata()
{
	Object[][] data=new Object[3][2];
	data[0][0]="user1";
	data[0][1]="pwd1";
	data[1][0]="user2";
	data[1][1]="pwd2";
	data[2][0]="user3";
	 data[2][1]="pwd3";
	 return data;
}
}

