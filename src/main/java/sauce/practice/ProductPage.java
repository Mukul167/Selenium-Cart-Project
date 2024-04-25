package sauce.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	private WebDriver driver;
	
	@FindBy(id = "item_0_title_link")
	private WebElement itemLink;
	
	@FindBy ( css = ".fa-3x")
	private WebElement cartButton;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void clickItem() {
		itemLink.click();
	}
	public void clickCartbtn() {
		cartButton.click();
	}
}
