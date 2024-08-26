package objectrepostive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	// Create WebDriver reference variable. 
	
	WebDriver driver;
	
	
	public login(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	


	By username = By.name("user-name");
	
	By password = By.name("password");
	
	By loginbutton = By.id("login-button");
	
	
	
	// Create a method to perform operations on each web element. 
	
	public void setUsername(String strusername)
	{
		driver.findElement(username).sendKeys(strusername); 
	}
	
	
	
	public void setpassword(String strpassword)
	{
	     driver.findElement(password).sendKeys(strpassword);
	}
	
	
	public void loginpage()
	{
		driver.findElement(loginbutton).click();
	}
	
	
	 public void loginData(String strusername, String strpassword) 
	   { 
	      //this.titleText(); 
	 
	      this.setUsername(strusername);
	      this.setpassword(strpassword);
	      this.loginpage();
	     } 
	 
	
	
	
	

}
