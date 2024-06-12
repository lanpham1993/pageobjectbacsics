package pages;

import com.w2a.base.Page;

public class LoginPage extends Page{


	public HomePage doLogin(String username, String password) {
		
		type("username_id",username);
		type("password_id",password);
		click("btnLogin_id");
		
		return new HomePage();

	}

}
