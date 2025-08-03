package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccoutnRegistrationTest extends BaseClass {

	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
	
		logger.info("****  Starting the Test ****");
		try {
		HomePage hp = new HomePage(driver);
		logger.info("****  Clicking My Account ****");
		hp.clickAccount();
		logger.info("****  Clicking Register ****");
		hp.cilckRegister();
		
		RegistrationPage rp = new RegistrationPage(driver);
		logger.info("****  Providing customer details ****");
		rp.setFirstName(randomString().toUpperCase());
		rp.setLastName(randomString().toLowerCase());
		rp.setEmail(randomString()+"@gasdf.ca");
		rp.setTelePhone(randomNumber());
		
		String pass = randomAlphaNumeric();
		rp.setPassword(pass);
		rp.setConfirmPassword(pass);
		rp.clickPoliy();
		rp.clickContinue();
		
		logger.info("****  Verifying ****");
		
		String getMsg = rp.getConfirmationMsg();
		
		if(getMsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}else {
			logger.error("Test Failed....");
			logger.debug("Debug Logs....");
			}
		}
		catch(Exception e) {
			
			Assert.fail("Test failed: "+ e.getMessage());
		}
		logger.info("***Testing Completed for TC_001_AccoutnRegistrationTest ***");

		}
	
}
