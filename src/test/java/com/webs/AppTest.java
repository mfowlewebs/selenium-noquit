package com.webs;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Unit test for Firefox quitting.
 */
public class AppTest {

	public RemoteWebDriver driver = null;

	@Before
	public void setupDriver() {
		System.out.println("Before - setting up driver");
		FirefoxProfile ffProfile = new FirefoxProfile();
		driver = new FirefoxDriver(ffProfile);
	}

	@org.junit.Test
	public void testApp() {
		System.out.println("Test - running");
		driver.get("http://www.google.de");
		System.out.println("Title: " + driver.getTitle());
	}

	@After
	public void cleanupDriver() {
		driver.close();
		driver.quit();
		System.out.println("After - cleaned up");
	}
}