package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeUpPage {

	@FindBy (xpath="(//a[text()='Devices'])[2]")
	private WebElement devices ;
	
	@FindBy (xpath="//a[text()='Face Makeup']")
	private WebElement faceMakeup ;
	
	@FindBy (xpath="(//div[@id='algolia_hits']//img)[6]")
	private WebElement selectProduct ;
	
	@FindBy (xpath="(//span[text()='ADD TO CART'])[1]")
	private WebElement addTocart ;
	
	public MakeUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void scrollDownToViewDevices(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",devices);
	}
	
	public void clickOnfaceMakeup() {
		faceMakeup.click();
	}
	
	public void selectProduct() {
		selectProduct.click();
	}
	
	public void clickOnAddTocartButton() {
		addTocart.click();
	}
	
}
