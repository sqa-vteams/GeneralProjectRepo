package FrameworkClasses;

import org.apache.commons.math3.util.Pair;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputClass {


	WebDriver driver;

	// constructor for driver
	public  InputClass(WebDriver driver)                   
	{
		this.driver=driver;
	}

	// Input by xpath
	public WebDriver EnterDataUsingXpath(String xpathvalue, String inputvalue)       
	{
		try 
		{
			driver.findElement(By.xpath(xpathvalue)).sendKeys(inputvalue);
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while sending data "+ e.getMessage());
			return this.driver;
		}


	}

	// Input by CSS Selector
	public WebDriver EnterDataUsingCssSelector(String cssselectorvalue, String inputvalue)  
	{
		try 
		{
			driver.findElement(By.cssSelector(cssselectorvalue)).sendKeys(inputvalue);
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while sending data "+ e.getMessage());
			return this.driver;
		}


	}

	// Input by ID
	public WebDriver EnterDataUsingID(String IDvalue, String inputvalue)  
	{
		try 
		{
			driver.findElement(By.id(IDvalue)).sendKeys(inputvalue);
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while sending data "+ e.getMessage());
			return this.driver;
		}


	}


	// Input by Name
	public WebDriver EnterDataUsingName(String Namevalue, String inputvalue)  
	{
		try 
		{
			driver.findElement(By.name(Namevalue)).sendKeys(inputvalue);
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while sending data "+ e.getMessage());
			return this.driver;
		}


	}





	// Click button by xpath
	public WebDriver ClickButtonByXpath (String xpathvalue)               
	{
		try 
		{
			driver.findElement(By.xpath(xpathvalue)).click();
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while Clicking button "+ e.getMessage());
			return this.driver;
		}


	}

	// Click button by CSS selector
	public WebDriver ClickButtonbyCssSelector (String cssselectorvalue)               
	{
		try 
		{
			driver.findElement(By.cssSelector(cssselectorvalue)).click();
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while Clicking button "+ e.getMessage());
			return this.driver;
		}


	}

	// Click button by ID
	public WebDriver ClickButtonbyID (String IDvalue)               
	{
		try 
		{
			driver.findElement(By.id(IDvalue)).click();
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while Clicking button "+ e.getMessage());
			return this.driver;
		}


	}


	// Click button by Name
	public WebDriver ClickButtonbyName (String Namevalue)               
	{
		try 
		{
			driver.findElement(By.name(Namevalue)).click();
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while Clicking button "+ e.getMessage());
			return this.driver;
		}


	}




	// Function for Clearing data in fields
	public WebDriver ClearData (String xpath)                
	{
		try 
		{
			driver.findElement(By.xpath(xpath)).clear();
			return this.driver;
		}

		catch (Exception e)
		{
			System.out.println("Exception while Clicking button "+ e.getMessage());
			return this.driver;
		}


	}


	// Function to Get WebElement
	public Pair<WebDriver, WebElement> GetWebElement(String xpath)                
	{

		WebElement Element= driver.findElement(By.xpath(xpath));
		return new Pair<WebDriver, WebElement>(this.driver, Element);
	}



}
