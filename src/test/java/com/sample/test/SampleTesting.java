package com.sample.test;

import org.testng.annotations.Test;

import com.sample.utility.BrowserManager;

public class SampleTesting {
	
	BrowserManager browserManagerObj = new com.sample.utility.BrowserManager();
	
	@Test
	public void testingYoutube() {
		browserManagerObj.lauchWebsiteByBrowser("chrome", "https://youtube.com");
		System.out.println("On youtube page");
		browserManagerObj.quitBrowser();
	}

}
