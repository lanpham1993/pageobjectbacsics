package pages;


import com.w2a.base.Page;

public class HomePage extends Page{
	
	public void AddToCart(String item) {
		click(item);
	}

	public DetailPage goToDetail(String item) {
		
		click(item);
		
		return new DetailPage();
	}

	public void goToCart() {
		click("cart_css");

	}

}
