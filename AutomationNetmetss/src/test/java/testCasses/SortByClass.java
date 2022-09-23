package testCasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortByClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\javascript\\Selenium22\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.netmeds.com/");
        
		WebElement homeopathy = driver.findElement(By.xpath("//a[text()='Homeopathy']"));
		homeopathy.click();
		
		WebElement highToLow = driver.findElement(By.xpath("//button[text()='High to Low']"));
		highToLow.click();
		
		WebElement lowtoHigh = driver.findElement(By.xpath("//button[text()='Low to High']"));
		lowtoHigh.click();
		
		WebElement discount = driver.findElement(By.xpath("//button[text()='Discount']"));
		discount.click();
	}

}
