package pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class DetailPage extends Page {

	public void AddToCart() {
		click("btnAddToCart_id");
	}
	
	public void removeItem() {
		driver.findElement(By.cssSelector("#remove")).click();
	}
	
	public void goToCart() {
		driver.findElement(By.cssSelector("#shopping_cart_container")).click();

	}
	
	public void backToHomePage() {
		click("linkBackToHomepage_id");
		
		
	}
}
