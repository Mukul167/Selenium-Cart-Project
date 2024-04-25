package sauce.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class LoginPage {

				private WebDriver driver;
				
				@FindBy(id = "user-name")
				private WebElement usernameField;
				
				@FindBy (id = "password")
				private WebElement passwordField;
				
				@FindBy (id = "login-button")
				private WebElement Loginbtn;
				
				@FindBy (id = "inventory_container")
				private WebElement inventoryContainer;
				
				public LoginPage (WebDriver driver) {
					this.driver = driver;
					PageFactory.initElements(driver, this);
				}
			
				public void enterUserName(String uName) {
					usernameField.sendKeys(uName);
				}
				
				public void enterPassword(String pWord) {
					passwordField.sendKeys(pWord);
				}
				
				public void clickLoginBtn() {
					Loginbtn.click();
				}
				
				public boolean isInventoryContainerDisplayed() {
					return inventoryContainer.isDisplayed();
				};
}
