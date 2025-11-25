package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectDropdownWithValue(WebElement element, String value) {

		Select object = new Select(element);
		object.selectByValue(value);

	}
	public void selectDropdownWithVisibleText(WebElement element,String value)
	{
		Select object = new Select(element);
		object.selectByVisibleText(value);
	}
	public void selectDropdownWithIndex(WebElement element,int value) {
		Select object = new Select(element);
		object.selectByIndex(value);
	}
	public void  rightClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}
	public void mouseHover(WebElement element,WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	

}
