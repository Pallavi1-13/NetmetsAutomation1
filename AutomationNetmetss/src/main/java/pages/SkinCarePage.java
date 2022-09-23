package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkinCarePage {

	@FindBy (xpath="(//span[text()='Moisturizers'])[1]")
	private WebElement moisturizers ;
	
	public SkinCarePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void moisturizersIsSelected() {
		boolean result = moisturizers.isSelected();
		System.out.println(result);
       }

}
