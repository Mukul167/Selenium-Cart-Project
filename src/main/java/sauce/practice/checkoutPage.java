package sauce.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
		private	WebDriver driver;
		
		@FindBy(linkText = "CHECKOUT")
	    private WebElement checkoutButton;

	    @FindBy(id = "first-name")
	    private WebElement firstNameField;

	    @FindBy(id = "last-name")
	    private WebElement lastNameField;

	    @FindBy(id = "postal-code")
	    private WebElement postalCodeField;

	    @FindBy(css = ".cart_button")
	    private WebElement continueButton;

	    @FindBy(linkText = "FINISH")
	    private WebElement finishButton;

	    @FindBy(css = ".complete-header")
	    private WebElement completeHeader;
		
		public checkoutPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void clickCheckButton() {
			checkoutButton.click();
		}
		
		public void enterFirstName(String firstName) {
			firstNameField.sendKeys(firstName);
		}
		
		public void enterLastName(String lastname) {
			lastNameField.sendKeys(lastname);
		}
		
		public void enterPinCode(String enterPinCode) {
			postalCodeField.sendKeys(enterPinCode);
		}
		
		public void clickContinueBtn() {
			continueButton.click();
		}
		
		public void clickFinishBtn() {
			finishButton.click();
		}
		
		public String getHeaderText() {
			return completeHeader.getText();
		}

		
		
}