package testNGclassesOfNetmet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import setup.BrowsersClass;
import utils.Utility;

public class AddToCartTestClass extends BrowsersClass {
    private WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;
    int testID;
    
    @BeforeSuite
    public void beforeSuite()
    {
    	System.out.println("Before Suite");
    }
    @Parameters ("browser") 
    @BeforeTest
    public void launchBrowser(String browserName)
    {
    	if (browserName.equals("chrome"))
    	{
    	 driver = openChromeBrowser();
    	}

 		if (browserName.equals("Firefox"))
 		{
 	     driver = openFirefoxBrowser();
 		}
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    
    @BeforeClass
    public void cratePOMobjects()
    {
    	homePage = new HomePage(driver);
    	cartPage = new CartPage(driver);
//    	(code changes- shift browse launch code in before test )
//    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\javascript\\Selenium22\\chromedriver_win32 _2\\chromedriver.exe");
// 		 driver = new ChromeDriver();
// 		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    	 driver.get("https://www.netmeds.com/");   
    }
	
    @BeforeMethod
    public void beforeMethod() throws InterruptedException
    {
    //	driver.get("https://www.netmeds.com/");
   	    Thread.sleep(3000);
    	homePage.openCartPage();	
    }
    
    @Test
    public void test() throws IOException
    {    
    	testID = 500;
		cartPage.sendDataOnSearchFuctionality();
		cartPage.clickOnSearchButton();
		cartPage.clickOnAddToCartButton();
	  //  Utility.captureScreenshot(testID, driver);
	
    }
    
    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException
    {
    	if(ITestResult.FAILURE== result.getStatus())
    	Utility.captureScreenshot(testID, driver);	
    	System.out.println("After Method");
    }
    
    @AfterClass
    public void cleanPOMobject()
    {
    	homePage = null;
    	cartPage = null;
    	System.out.println("After Class");
    }

    @AfterTest
    public void afterTest()
    {
    	System.out.println("After Test");
    	driver.close();
    	driver = null;
    	System.gc();       //garbage collector- delete unused object
    }
	
    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("After Suite");
    }
	
}
