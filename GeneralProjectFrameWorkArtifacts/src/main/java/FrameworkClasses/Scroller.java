package FrameworkClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroller {
	//this class driver object as data member
	private WebDriver driver;
	
	//constructor 
	public Scroller(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	//scroll to function using pixels includes exception handling
	public WebDriver scrollToPixel(WebDriver driver, String Pixel)
	{	
		this.driver=driver;
		JavascriptExecutor js = ((JavascriptExecutor) this.driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return this.driver;
	}
	//scroll to element using x,y coordinates
	public WebDriver scrollToCoordinate(WebDriver driver, String x, String y)
	{
		this.driver = driver;
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		return this.driver;
	}
	
	//scroll to element view
	public WebDriver scrollToElement(WebDriver driver, WebElement element)
	{
		this.driver = driver;
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		return this.driver;
	}
	

}
