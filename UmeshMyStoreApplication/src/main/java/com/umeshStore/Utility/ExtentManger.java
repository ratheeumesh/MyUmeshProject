package com.umeshStore.Utility;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManger {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extentReporter;
	public static ExtentTest test;
	
	public static void setHtmlReport() {
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir"+"test-output/ExtentReport/"+"MyUmeshStore.html");
		htmlReporter.loadXMLConfig("user.dir"+"extent-config.xml");
		
		extentReporter= new ExtentReports();
		extentReporter.attachReporter(htmlReporter);
		
		extentReporter.setSystemInfo("HostName", "Host");
		extentReporter.setSystemInfo("ProjectName", "MyUmeshStore");
		extentReporter.setSystemInfo("os", "Windows10");
		extentReporter.setSystemInfo("browser", "Chrome");
	}
	
	public static void endReport() {
		extentReporter.flush();
	}

}
