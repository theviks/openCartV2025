package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;

public class TC_002_LoginPageTest extends BaseClass {

	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("*** Starting Login Test***");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		
		lp.clickLogin();
		
		myAccountPage map = new myAccountPage(driver);
		boolean tagetPage = map.isMyAccoutnPageExist();
		Assert.assertTrue(tagetPage); // Assert.assertEquals(targetPage,True, "page not displayed")
		}catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("*** Test Tc_002_LoginPageTest Completed***");
	}
}
