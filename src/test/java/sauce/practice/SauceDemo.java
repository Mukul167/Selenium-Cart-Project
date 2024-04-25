package sauce.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemo {

	private WebDriver driver;

	
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	@Test
	public void testSauceDemo() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		ProductPage prod = new ProductPage(driver);
		checkoutPage chkbtn = new checkoutPage(driver);
		
		loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginBtn();
        
        Assert.assertTrue(loginPage.isInventoryContainerDisplayed(), "Login failed");
        
        prod.clickItem();
        prod.clickCartbtn();
       
        chkbtn.clickCheckButton();
        chkbtn.enterFirstName("Demo");
        chkbtn.enterLastName("project");
        chkbtn.enterPinCode("654128");
        chkbtn.clickContinueBtn();
        chkbtn.clickFinishBtn();
        
        
        
        Assert.assertEquals(chkbtn.getHeaderText(),"THANK YOU FOR YOUR ORDER");
       
	}
	
	
        @AfterMethod
        public void close() {
        	driver.close();
        }
        	
        
             
       
        
       
		
	}

