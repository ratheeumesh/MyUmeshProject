package com.umeshStore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.umeshStore.Utility.ExtentManger;

import Action.java.Action;
import io.github.bonigarcia.wdm.WebDriverManager;


//import com.mystore.base.BeforeSuite;
//import com.mystore.utility.ExtentManager;

public class BaseClass {
	
	public Properties prop;
//	public WebDriver driver; // it should be static:
	
	// For threading we will declare webdriver here: // this is adding due to parallel execution.
	public static ThreadLocal<RemoteWebDriver> driver= new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	
	@BeforeTest
	public void loadConfig() {
		ExtentManger.setHtmlReport();
		DOMConfigurator.configure("log4j.xml");
		
		try {
			prop = new Properties();
//			FileInputStream ip= new FileInputStream(System.getProperty("user.dir"+"\\Configuration\\config.properties")
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuratrion\\configuration.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void launchApp(String browserName) {
		WebDriverManager.chromedriver().setup();
//		String browserName = prop.getProperty("browser");
		System.out.print(browserName);
//		driver= new ChromeDriver(); 
		if (browserName.equalsIgnoreCase("Chrome")) {
//			driver= new ChromeDriver();
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
//			driver= new FirefoxDriver();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
//			driver= new InternetExplorerDriver();
			driver.set(new InternetExplorerDriver());
		}

		getDriver().manage().window().maximize(); // changed driver  with getDriver(), for parallel execution
		Action.implicitWait(getDriver(), 20);
		Action.pageLoadTimeOut(getDriver(), 30);
		getDriver().get(prop.getProperty("url"));
		
}
}
