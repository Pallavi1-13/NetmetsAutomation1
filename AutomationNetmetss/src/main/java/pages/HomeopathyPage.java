package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeopathyPage {
    private WebDriver driver;
    
	@FindBy ( xpath= "//a[text()='Homeopathy']")
	private WebElement homeopathy;
	
	@FindBy ( xpath= "//button[text()='High to Low']")
	private WebElement highToLow;
	
	@FindBy ( xpath= "//button[text()='Low to High']")
	private WebElement lowToHigh;
	
	@FindBy ( xpath= "//button[text()='Discount']")
	private WebElement discount;
	
	public HomeopathyPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void openHomeopathyPage()
	{
		homeopathy.click();
	}
	
	public void clickOnHighToLowButton()
	{
		highToLow.click();
	}
	
	public void clickOnLowToHighButton()
	{
		lowToHigh.click();
	}
	
	public void clickOnDiscountButton()
	{
		discount.click();
	}

	
}
