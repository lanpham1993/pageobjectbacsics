package com.w2a.testcases;

import org.testng.annotations.Test;

import pages.DetailPage;
import pages.HomePage;

public class viewDetailTest extends BaseTest{

	@Test
	public void openDetailTest() throws InterruptedException {
		HomePage home =  new HomePage();
		DetailPage detail =  home.goToDetail("linkBackback_id");
		Thread.sleep(500);
		detail.backToHomePage();
	}
}
