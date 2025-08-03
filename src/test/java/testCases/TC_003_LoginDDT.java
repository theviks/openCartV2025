package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DataDriven") // Getting data provider from different package by using dataProvidersClass parameter
	public void verify_login(String email,String pass, String exp) {
		
		logger.info("*** Starting  TC_003_LoginDDT***");
	try {		
		HomePage hp = new HomePage(driver);
		hp.clickAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pass);
		
		lp.clickLogin();
		
		myAccountPage map = new myAccountPage(driver);
		boolean targetPage = map.isMyAccoutnPageExist();
		
		/*
		 * Data is valid - login is pass - logout
		 * 				   login is fail 	
		 * 
		 * Data is invalid - login is pass - logout
		 * 					 login is fail  
		 * */
		
		if(exp.equalsIgnoreCase("Valid")) {
			if(targetPage==true) {
				map.clickLogOut();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid")) {
			if(targetPage==true) {
				map.clickLogOut();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	}catch(Exception e) {
		Assert.fail();
	}
		logger.info("*** Finishing  TC_003_LoginDDT***");
		
	}
}
