package pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class DetailPage extends Page {

	public void AddToCart(String item) {
		driver.findElement(By.cssSelector(item)).click();
	}
	
	public void removeItem() {
		driver.findElement(By.cssSelector("#remove")).click();
	}
	
	public void goToCart() {
		driver.findElement(By.cssSelector("#shopping_cart_container")).click();

	}
	
	public void backToHomePage() {
		driver.findElement(By.cssSelector("#back-to-products")).click();
	}
}
