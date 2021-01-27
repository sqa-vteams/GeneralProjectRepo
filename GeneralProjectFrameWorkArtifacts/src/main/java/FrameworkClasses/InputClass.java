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
	public WebDriver EnterDataUsingXpath(WebDriver driver,String xpathvalue, String inputvalue)       // Function 1
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver EnterDataUsingCssSelector(WebDriver driver,String cssselectorvalue, String inputvalue)   // Function 2
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver EnterDataUsingID(WebDriver driver,String IDvalue, String inputvalue)   // Function 3
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver EnterDataUsingName(WebDriver driver,String Namevalue, String inputvalue)  // Function 4
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver ClickButtonByXpath (WebDriver driver,String xpathvalue)               // Function 5
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver ClickButtonbyCssSelector (WebDriver driver,String cssselectorvalue)               // Function 6
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver ClickButtonbyID (WebDriver driver,String IDvalue)               // Function 7
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver ClickButtonbyName (WebDriver driver,String Namevalue)               // Function 8
	{
		try 
		{
			this.driver=driver;
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
	public WebDriver ClearData (WebDriver driver,String xpath)                // Function 9
	{
		try 
		{
			this.driver=driver;
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
	public Pair<WebDriver, WebElement> GetWebElement(WebDriver driver,String xpath)               // Function 10 
	{
		this.driver=driver;
		WebElement Element= driver.findElement(By.xpath(xpath));
		return new Pair<WebDriver, WebElement>(this.driver, Element);
	}



}
