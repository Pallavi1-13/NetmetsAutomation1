package testCasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class CustomerTestimonialsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\javascript\\Selenium22\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.netmeds.com/");
        
        HomePage homePage = new HomePage(driver);
        homePage.scrollDownUoToCompany(driver);
        Thread.sleep(4000);
        homePage.opencustomersSpeakPage();
        
        
	}

}
