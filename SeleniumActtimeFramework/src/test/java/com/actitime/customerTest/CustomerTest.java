package com.actitime.customerTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class CustomerTest extends BaseClass{
@Test
public void CreatetcustomerTest()
{
System.out.println("createCustomertest");

driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://accounts.google.com");
driver.close();
}
@Test
public void EditCustomerTest()
{
System.out.println("Editcustomertest");	
}
@Test
public void DeleteCustomerTest()
{
	System.out.println("Deletecustomertest");
}
}
