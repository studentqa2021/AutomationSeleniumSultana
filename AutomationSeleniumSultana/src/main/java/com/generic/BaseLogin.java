package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.MyScreenshot;

public class BaseLogin {
  public static void getMylogin(){
	  	
	  	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	  	driver.navigate().to(BaseConfig.getConfigValue("URL"));
	  	driver.manage().window().maximize();
	  	MasterPageFactory obj= new MasterPageFactory(driver);
	  	Highlighter.addColor(driver,obj.getSigninbtn());
	  	obj.getSigninbtn().click();
	  	MyScreenshot.addScreenShot(driver, "this is before login");
	  	Highlighter.addColor(driver,(obj.getEmail()));
	  	obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));
	  	Highlighter.addColor(driver,(obj.getPass()));
	  	obj.getPass().sendKeys(BaseConfig.getConfigValue("password"));
	  	obj.getLoginbtn().click();
	  	MyScreenshot.addScreenShot(driver, "this is after login");
	  	driver.quit();

	  		  	

	  }


	  
	  
	  
	  
	 
	 
	 
	 
	 
 }


