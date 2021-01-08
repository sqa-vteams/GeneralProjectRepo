package FrameworkClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroller {
	//this class driver object as data member
	public WebDriver driver;
	
	//constructor 
	public Scroller(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	//scroll to function using pixels includes exception handling
	public WebDriver scrollToPixel(WebDriver driver, String Pixel)
	{	
		try 
		{
			this.driver=driver;
			JavascriptExecutor js = ((JavascriptExecutor) this.driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			return this.driver;
		}
		catch (Exception e){
			
			System.out.println("Exception while running scroll function "+ e.getMessage());
			return this.driver;
		}
	}
	//scroll to element using x,y coordinates
	public WebDriver scrollToCoordinate(WebDriver driver, String x, String y)
	{
		try
		{
			this.driver = driver;
			JavascriptExecutor js = (JavascriptExecutor) this.driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			return this.driver;
		}
		catch (Exception e)
		{
			
			System.out.println("Exception while running scroll function "+ e.getMessage());
			return this.driver;
		}
		
	}
	
	//scroll to element view
	public WebDriver scrollToElement(WebDriver driver, WebElement element)
	{
		try
		{
			this.driver = driver;
			JavascriptExecutor js = (JavascriptExecutor) this.driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			return this.driver;
		}
		
		catch (Exception e)
		{
			
			System.out.println("Exception while running scroll function "+ e.getMessage());
			return this.driver;
		}
	}
	
	public WebDriver scrollToBottom(WebDriver driver)
	{
		try
		{
			this.driver = driver;
			JavascriptExecutor js = (JavascriptExecutor) this.driver;	
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			return this.driver;
	
		}
		catch (Exception e)
		{
			
			System.out.println("Exception while running scroll function "+ e.getMessage());
			return this.driver;
		}
	}
	//scroll to the element in view horizontally 
	public WebDriver scrollHorizontolly(WebDriver driver, WebElement element)
	{
		try 
		{
			this.driver=driver;
			JavascriptExecutor js = (JavascriptExecutor) this.driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			return this.driver;
	
		}
		catch (Exception e)
		{
			
			System.out.println("Exception while running scroll function "+ e.getMessage());
			return this.driver;
		}
	}
	
	//Scroll to top of the page
	public WebDriver scrollToTop(WebDriver driver)
	{
		try 
		{
			this.driver=driver;
			JavascriptExecutor js = (JavascriptExecutor) this.driver;
			js.executeScript("window.scrollTo(0, 0);");
			return this.driver;
	
		}
		catch (Exception e)
		{
			
			System.out.println("Exception while running scroll function "+ e.getMessage());
			return this.driver;
		}
	}

}
