package testCases;

import java.io.FileReader;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchProduct;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass{

	@Test(groups="Sanity")
	public void searchTest() {
		logger.info("***Starting Search Bar Test***");
		try {
		SearchProduct sp = new SearchProduct(driver);
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
	
		sp.sendValue(p.getProperty("searchValue"));
		sp.clickSearch();
		
		if(sp.vSearch()==true) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("***Completed Search Bar Test***");
	}
}