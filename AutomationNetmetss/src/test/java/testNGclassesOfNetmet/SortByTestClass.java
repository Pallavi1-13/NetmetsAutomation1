package testNGclassesOfNetmet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
import org.testng.asserts.SoftAssert;

import pages.HomeopathyPage;
import setup.BrowsersClass;
import utils.Utility;

public class SortByTestClass extends BrowsersClass  {
     private WebDriver driver;
	 private SoftAssert soft;
	 private HomeopathyPage homeopathyPage;
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
	    	System.out.println("Before Test");
	    }
	 
     @BeforeClass
      public void beforeClass()
      {
    	 homeopathyPage = new HomeopathyPage(driver);
        // driver.get("https://www.netmeds.com/");
    	 System.out.println("Before Class");
         
      }
     
     @BeforeMethod
      public void beforeMethod() throws InterruptedException
      {
    	 driver.get("https://www.netmeds.com/");
    	 Thread.sleep(3000);
    	 homeopathyPage.openHomeopathyPage();
    	 
    	 String url = driver.getCurrentUrl();
    	 String title = driver.getTitle();
    	 
    	 Assert.assertEquals(url, "https://www.netmeds.com/non-prescriptions/ayush/homeopathy");
    	 Assert.assertEquals(title, "Homeopathy Medicines, Products Online at Best Price @Netmeds");
    	 soft = new SoftAssert ();
//    	 validation if-else replace in assert
//    	 if (url.equals("https://www.netmeds.com/non-prescriptions/ayush/homeopathy"))
//    	 {
//    		 System.out.println("Test case pass");
//    	 }
//    	 else
//    	 {
//    		 System.out.println("Test case fail");
//    	 }
//    	 if (title.equals("Homeopathy Medicines, Products Online at Best Price @Netmeds"))
//    	 {
//    		 System.out.println("valid title");
//    	 }
//    	 else
//    	 {
//    		 System.out.println("Invalid title");
//    	 }
     }
     
     @Test   
     public void test1() throws IOException
     {   
    	 testID = 1000;
    	 homeopathyPage.clickOnHighToLowButton();
    	 String url = driver.getCurrentUrl();
    	 SoftAssert soft = new SoftAssert ();
    	 soft.assertEquals(url, "https://www.netmeds.com/non-prescriptions/ayush/homeopath");
    	// Utility.captureScreenshot(testID, driver);
    	 
//    	 if (url.equals("https://www.netmeds.com/non-prescriptions/ayush/homeopathy"))
//    	 {
//    		 System.out.println("Valid Url test1"); 
//    	 }
//    	 else
//    	 {
//    		 System.out.println("Valid Url test1");
//    	 }
    	 soft.assertAll();
    	 
     }
     
     @Test  (enabled = false)
     public void test2() throws IOException
     {   
    	 testID = 1001;
    	 homeopathyPage.clickOnLowToHighButton();
    	 String url = driver.getCurrentUrl();
    	 soft.assertEquals(url, "https://www.netmeds.com/non-prescriptions/ayush/homeopathy");
    	 Utility.captureScreenshot(testID,driver);
    	 
//    	 if (url1.equals("https://www.netmeds.com/non-prescriptions/ayush/homeopathy"))
//    	 {
//    		System.out.println("Valid Url test2"); 
//    	 }
    	 soft.assertAll();
     }
     
     @Test (enabled = false)
     public void test3() throws IOException
     {   
    	 testID = 1002;
    	 homeopathyPage.clickOnDiscountButton();
    	 String url = driver.getCurrentUrl();
    	 soft.assertEquals(url, "https://www.netmeds.com/non-prescriptions/ayush/homeopathy");
    	 Utility.captureScreenshot(testID, driver);
    	 
//    	 if (url.equals("https://www.netmeds.com/non-prescriptions/ayush/homeopathy"))
//    	 {
//    		 System.out.println("Valid Url test3");
//    	 }
//    	 else
//    	 {
//    		 System.out.println("Invalid Url test3");
//    	 }
    	 soft.assertAll();
     }
     
     @AfterMethod
     public void afterMethod(ITestResult result) throws IOException
     {
    	if(ITestResult.FAILURE== result.getStatus())
    	Utility.captureScreenshot(testID, driver);	
    	System.out.println("after Method"); 
    	driver.navigate().back();
     }
     
     @AfterClass
     public void afterClass()
     {
    	homeopathyPage = null;
    	System.out.println("After Class"); 
     }
     
     @AfterTest
     public void afterTest()
     {
     	System.out.println("After Test");
     	System.gc();
     }
 	
     @AfterSuite
     public void afterSuite()
     {
     	System.out.println("After Suite");
     }
 	
}
