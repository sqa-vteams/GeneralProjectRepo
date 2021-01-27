package FrameworkClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	
	
	 WebDriver driver;
	 
	 public WaitClass(WebDriver driver)                   // constructor for driver
		{
			this.driver=driver;
		}
	 
		
		public WebDriver WaitforelementtobeClickable(WebDriver driver,String xpath, int time)         // Wait Function 1              
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
	
		
		public WebDriver WaitforelementToBeSelected(WebDriver driver,String xpath, int time)         // Wait Function 2           
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public WebDriver WaitforpresenceOfElementLocated(WebDriver driver,String xpath, int time)         // Wait Function 3           
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		public WebDriver WaitforvisibilityOfElementLocated(WebDriver driver,String xpath, int time)         // Wait Function 4           
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
	
	
		public WebDriver WaitfortitleIs(WebDriver driver,String title, int time)         // Wait Function 5          
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.titleIs(title));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		

		public WebDriver WaitfortitleContains(WebDriver driver,String title, int time)         // Wait Function 6         
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.titleContains(title));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public WebDriver WaitforInvisibilityOfElementLocated(WebDriver driver,String xpath, int time)         // Wait Function 7         
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public WebDriver WaitfortextToBePresentInElement(WebDriver driver,String xpath, String Texttobepresent, int time)   // Wait Function 8         
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath), Texttobepresent));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public WebDriver WaitforUrlContains(WebDriver driver,String text, int time)         // Wait Function 9       
		{
			try {
				
			this.driver=driver;
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.urlContains(text));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
				
}
