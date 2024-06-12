package pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CartPage extends Page {
 
	public DetailPage gotoDetail(String item) {
		driver.findElement(By.cssSelector(item)).click();
		return new DetailPage();
	}
	
	public void removeItem(String item) {
		driver.findElement(By.cssSelector(item)).click();
	}
	
	public void gotoHomePage() {
		
	}
	
	public void gotoCheckOut() {
		
	}
}
