package com.webs;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Hello Firefox!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		FirefoxProfile ffProfile = new FirefoxProfile();
		// The binary is installed from latest german version FirefoxPortable_38.0.5_German.paf.exe
		//FirefoxBinary ffBinary = new FirefoxBinary(new File("X:/Applications/FirefoxPortable/FirefoxPortable.exe"));
		RemoteWebDriver driver = new FirefoxDriver(ffProfile);
		driver.get("http://www.google.de");
		System.out.println("Title: " + driver.getTitle());
		// Close the current window, quitting the browser if it's the last window currently open.
		// TODO but is does not
		driver.close();
		// Quits this driver, closing every associated window
		// TODO but is does not
		driver.quit();
		System.out.println("Done");
	}
}