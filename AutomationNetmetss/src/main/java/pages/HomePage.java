package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath="//div[@class='text']")
	private WebElement cart ;
	
	@FindBy (xpath="(//a[text()='Beauty'])[1]")
	private WebElement beauty ;
	
	@FindBy (xpath="//a[text()='Make-Up']")
	private WebElement makeup ;

	@FindBy (xpath="//h2[text()='Company']")
	private WebElement company ;
	
	@FindBy (xpath="//a[text()='Customers Speak']")
	private WebElement customersSpeak ;
	
	@FindBy (xpath="//a[text()='Skin Care']")
	private WebElement skinCare ;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openCartPage() {
		cart.click();
	}
	
	public void openMakeupPage(WebDriver driver) {
		Actions a = new Actions(driver);
        a.moveToElement(beauty).moveToElement(makeup).click().build().perform();

	}
	
	public void scrollDownUoToCompany(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",company);
	}
	
	public void opencustomersSpeakPage() {
		customersSpeak.click();
	}
	
	public void openSkinCarePage(WebDriver driver) {
		Actions a = new Actions(driver);
        a.moveToElement(beauty).moveToElement(skinCare).click().build().perform();

	}
	
	
}
