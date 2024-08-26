package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepostive.login;

  

public class Testbase {
	
	
	
	// Declare WebDriver reference variable and make it static. 
	  public static WebDriver driver = null; 
	  
	  @BeforeTest
	  public void basicSetUp() 
	   { 
		  
		 // System.setProperty("webdriver.chrome.driver","E:\\SeleniumDec23batch\\chromedriver.exe");
		  
		  
	     driver = new ChromeDriver();
	     
	     
	// To maximize browser. 
	     driver.manage().window().maximize(); 
	
	     
	     
	// Open page. 
	     driver.get("https://www.saucedemo.com/"); 
	     
	     driver.manage().deleteAllCookies();
	 }
	  
	  @Test
	  public void loginscreen() 
	  { 
	// Create an object of SIMLoginPage class and pass WebDriver reference to its constructor. 
	   login test = new login(driver);
	   
	   
	   test.loginData("standard_user","secret_sauce");
	
	   
	 
	  
	  }	  

}
