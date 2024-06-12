package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HamburgerMenu {

	WebDriver driver;
	public HamburgerMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToAllItem() {
		
		driver.findElement(By.cssSelector("nav.bm-item-list > a:first-child")).click();

	}

	public void goToAbout() {

		driver.findElement(By.cssSelector("nav.bm-item-list > a:nth-child(2)")).click();

	}

	public void goToLogout() {

		driver.findElement(By.cssSelector("nav.bm-item-list > a:nth-child(3)")).click();

	}

	public void goToResetAppState() {

		driver.findElement(By.cssSelector("nav.bm-item-list > a:last-child")).click();

	}
}
