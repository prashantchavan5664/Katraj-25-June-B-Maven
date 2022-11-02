package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest {
	
	HomePage hp;
	LoginPage lp;
	
	@BeforeClass
	public void  objectCreation() {
		
		lp =new LoginPage(driver);
		hp= new HomePage(driver);
	}
	
	@BeforeMethod
	public void precondition() {
		
		lp.enterCred("Admin", "admin123");
		lp.clickButton();
	}
	
	@Test
	public void logout() {
		
		hp.clickOnProfile();
		hp.clickOnLogout();
	}

}
