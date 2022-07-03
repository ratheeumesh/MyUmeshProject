/**
 * 
 */
package com.umeshStore.Utility;

import org.testng.log4testng.Logger;

/**
 * @author umeshrathee
 *
 */
public class Log {
	
	public static Logger log= Logger.getLogger(Log.class);
	
	
	public static void startLogTestCase(String testCaseName) {
		log.info("============================"+testCaseName+"==========================");
	}
	
	public static void endLogTestCase(String testName) {
		log.info("============================"+testName+"==========================");
	}

	public static void info(String message) {
		log.info(message);
	}
	
	public static void warn(String message) {
		log.warn(message);
	}
	
	public static void fatalerror(String message) {
		log.fatal(message);
		
	}
	
	public static void debug(String message) {
		log.debug(message);
	}
	
	
}
