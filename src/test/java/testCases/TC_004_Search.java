package testCases;

import pageObjects.SearchProduct;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass{

	public void search() {
	SearchProduct sp = new SearchProduct(driver);
	
	sp.sendValue("Mac");
	sp.clickSearch();
	}
}