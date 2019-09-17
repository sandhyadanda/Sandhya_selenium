package PageTest;

import org.testng.annotations.Test;

import Base.BaseScreen;
import Pages.Login;


public class LoginTest extends BaseScreen {

	@Test
	public void logintesting() throws Exception {

		openURL();
		new Login().loginpage();
	}



}
