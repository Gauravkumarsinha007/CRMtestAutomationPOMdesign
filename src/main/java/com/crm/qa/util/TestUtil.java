package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT= 40;
	public static long IMPLICITY_WAIT= 40;
	
	public void switchtoframe()
	{
		driver.switchTo().frame("mainpanel");
	}
	
}
