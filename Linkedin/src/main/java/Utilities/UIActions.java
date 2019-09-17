package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseScreen;

public class UIActions extends BaseScreen{
	
	public void draganddrop(WebElement source,WebElement target) {
		
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.elementToBeClickable(source));
		wait.until(ExpectedConditions.elementToBeClickable(target));


		Actions act = new Actions(driver);
		act.dragAndDrop(source, target);
		
	}
	
	
	public boolean enabled(WebElement e) {
		
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		
		return  e.isDisplayed();

	}
	

}


