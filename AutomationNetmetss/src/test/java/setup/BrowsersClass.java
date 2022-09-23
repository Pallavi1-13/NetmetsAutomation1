package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersClass {

	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\javascript\\Selenium22\\chromedriver_win32 _2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Documents\\javascript\\Selenium22\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
