package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.Utilities.TestUtil;


import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test (dataProviderClass = TestUtil.class, dataProvider="dp")
	public void logintest(Hashtable<String,String> data) throws InterruptedException {
	if(!data.get("runmode").toLowerCase().equals("y")) {
			throw new SkipException("Skipping the test case as the Run Mode for data set is NO");
		}
	LoginPage login = new LoginPage();
	Thread.sleep(500);
	//System.out.print("user:    " + data.get("username")+ "pass:  "+ data.get("password"));
	login.doLogin(data.get("username"), data.get("password"));
    
	}

}

