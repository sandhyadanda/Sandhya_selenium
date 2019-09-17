package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseScreen;

public class Login extends BaseScreen{
	
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement email;
	
	
	@FindBy(id = "password")
	WebElement Pswd;

	
	@FindBy(xpath = "//button[@class='btn__primary--large from__button--floating']")
	WebElement signin;

	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void loginpage() throws Exception{
		Thread.sleep(2000);
		email.sendKeys(prop.getProperty("Email"));
		Thread.sleep(1000);

		Pswd.sendKeys(prop.getProperty("Password"));
		Thread.sleep(1000);

		signin.click();
		Thread.sleep(8000);

	}
	
	
	
	
	

}
