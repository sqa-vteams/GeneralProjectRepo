package FrameworkClasses;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	WebDriver driver;
	Select drp;
	
	public SelectClass (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public Select selectByIndex(WebElement drop,int i)
	{
		
		try {
				this.drp = new Select(drop);
				this.drp.selectByIndex(i);
				return this.drp;
			}
		catch (Exception e){
			
				System.out.println("Exception while running selectByIndex function "+ e.getMessage());
				return this.drp;
		}
		
	}
	
	public Select selectByText(WebElement drop, String text)
	{
		try {
				this.drp = new Select(drop);
				this.drp.selectByVisibleText(text);
				return this.drp;
		}
		catch (Exception e)
		{
			
			System.out.println("Exception while running selectByText function "+ e.getMessage());
			return this.drp;
		}
		
		}
	
	public Select selectByValue(WebElement drop, String Value)
	{
		try {
			this.drp = new Select(drop);
			this.drp.selectByValue(Value);
			return this.drp;
	}
	catch (Exception e)
	{
		
		System.out.println("Exception while running selectByValue function "+ e.getMessage());
		return this.drp;
	}
		
		
	
		
	}
	
	
	
	

}
