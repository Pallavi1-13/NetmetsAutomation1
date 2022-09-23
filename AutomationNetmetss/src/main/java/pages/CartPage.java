package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy (xpath="//input[@type='text']")
	private WebElement searchFuctionality ;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement searchButton ;
	
	@FindBy (xpath="//span[text()='ADD TO CART']")
	private WebElement cartButton ;
	
	public CartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendDataOnSearchFuctionality() {
		searchFuctionality.sendKeys("Paracetamol 650");
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickOnAddToCartButton() {
		cartButton.click();
	}
}
