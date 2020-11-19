package FrameworkClasses;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserinitiationclass {


	WebDriver driver;


	public WebDriver Chromeinitiation(String URL)                       // Function for Chrome
	{
		try {
			
			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.SEVERE);
			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
			System.setProperty("webdriver.chrome.silentLogging", "true");
			System.setProperty("webdriver.chrome.verboseLogging", "false");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			this.driver = new ChromeDriver(options);
			
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--disable-logging"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--silent");
	        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
			java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			
			this.driver.get(URL);
			this.driver.manage().window().maximize();
			return this.driver;

		}	
		catch (Exception e)
		{
			System.out.println("Exception while Initiating Chrome Driver "+ e.getMessage());
			return this.driver;

		}
	}




	public WebDriver Firefoxinitiation(String URL)                    // Function for Firefox
	{
		try {

			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");   // command to hide logs
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");  
			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.SEVERE);
			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
			System.setProperty("webdriver.chrome.silentLogging", "true");
			System.setProperty("webdriver.chrome.verboseLogging", "false");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
			this.driver=new FirefoxDriver(options);
			
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--disable-logging"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--silent"); 
			java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
			java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			
			this.driver.get(URL);
			this.driver.manage().window().maximize();
			return this.driver;


		}
		catch(Exception e)
		{
			System.out.println("Exception while Initiating Firefox Driver "+ e.getMessage());
			return this.driver;

		}

	}



	public WebDriver operainitiation(String URL)          // Function for Opera
	{
		try {
			
			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.SEVERE);
			Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
			System.setProperty("webdriver.chrome.silentLogging", "true");
			System.setProperty("webdriver.chrome.verboseLogging", "false");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
			 
			WebDriverManager.operadriver().setup();
			this.driver=new OperaDriver();
			this.driver.get(URL);
			this.driver.manage().window().maximize();
			return this.driver;
			
			
		}

		catch(Exception e)
		{
			System.out.println("Exception while Initiating Opera Driver "+ e.getMessage());
			return this.driver;

		}

	}


	
	
	
	
	


}
