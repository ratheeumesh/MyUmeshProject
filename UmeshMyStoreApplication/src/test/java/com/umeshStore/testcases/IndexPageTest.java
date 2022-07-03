/**
 * 
 */
package com.umeshStore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.umeshStore.Utility.Log;
import com.umeshStore.base.BaseClass;
import com.umeshStore.pageObjects.Login_Page;

/**
 * @author umeshrathee
 *
 */
public class IndexPageTest extends BaseClass{
		
	Login_Page login_page;
		
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}
	
	
	@AfterMethod 
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups="smoke")
	public void verifyLogo() {
		Log.startLogTestCase("VerifyLogo");
		login_page= new Login_Page(getDriver());
		boolean logo_presence= login_page.validateLogo() ;
		Log.info("logger will going to login to website");
		System.out.println(logo_presence);
		Log.info("status of log_presence is"+ String.valueOf(logo_presence));
		Assert.assertTrue(logo_presence);
		Log.info("Login is success");
		Log.endLogTestCase("LoginTest");
		
	}
	
//	@Test(dataProvider="credentials",dataProviderClass=DataProvider.class,groups= {"smoke","sanity"})
	
	@Test(groups= {"smoke","sanity"})
	public void verifyTitleLogo() {
		login_page= new Login_Page(getDriver());
		String title= login_page.getUmeshStoreTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Store");
		
	}
}
