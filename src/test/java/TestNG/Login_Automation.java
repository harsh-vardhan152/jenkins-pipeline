package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Automation {
	
	String driverPath="C:\\Users\\asus\\Documents\\chrome web drive/chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement username = driver.findElement(By.id("user_email_login"));
		WebElement password = driver.findElement(By.id("user_password"));
		WebElement login = driver.findElement(By.name("commit"));
		
		username.clear();
		username.click();
		username.sendKeys("abc@gmail.com");
		
		password.clear();
		password.click();
		password.sendKeys("Karsn@123");
		login.click();
		
		
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Documents\\chrome web drive/chromedriver.exe");
	  
	  driver = new ChromeDriver();
  
  }
	
	 @AfterTest
	  public void afterTest() {
		 String actualUrl = "https://www.browserstack.com/users/dashborad";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
	  }
}
