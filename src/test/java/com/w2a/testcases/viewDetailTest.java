package com.w2a.testcases;

import org.testng.annotations.Test;

import pages.HomePage;

public class viewDetailTest extends BaseTest{

	@Test
	public void openDetailTest() throws InterruptedException {
		HomePage home =  new HomePage();
		home.goToDetail("linkBackback_id");
		Thread.sleep(500);
	}
}
