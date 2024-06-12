package com.w2a.rough;


import pages.DetailPage;
import pages.HomePage;
import pages.LoginPage;
public class LoginTest  {

	public static void main(String[] args) throws InterruptedException {
		
		LoginPage login = new LoginPage();
		
		HomePage home = login.doLogin("standard_user", "secret_sauce");
		Thread.sleep(500);
		home.AddToCart("linkBackpack_css");
		DetailPage detail = home.goToDetail("linkBackback_css");
		Thread.sleep(500);
		detail.removeItem();
	}

}
