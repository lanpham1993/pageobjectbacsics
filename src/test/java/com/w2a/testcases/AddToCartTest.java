package com.w2a.testcases;

import org.testng.annotations.Test;

import pages.DetailPage;
import pages.HomePage;

public class AddToCartTest extends BaseTest{

	HomePage home = new HomePage();
	@Test
	public void addToCartFromProductPage() throws InterruptedException {
		home.AddToCart("btnFleeceJacket_id");
		Thread.sleep(500);
	}
	
	@Test
	public void addToCartFromDetailPage() throws InterruptedException {
		DetailPage detail =  home.goToDetail("linkTshirtRed_id");
		Thread.sleep(500);
		detail.AddToCart();
		Thread.sleep(500);
		detail.backToHomePage();
	}
}
