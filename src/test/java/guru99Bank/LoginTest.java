package guru99Bank;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTest {
	private WebDriver driver;
	
	 @Test
	  public void launchApp() {
		 driver.get("http://www.demo.guru99.com/V4/");
		 String title = driver.getTitle();
		 System.out.println("Title is :" +title);
		 Assert.assertTrue(title.contains("Guru99 Bank Home Page"));
		 
		 WebElement userID = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		 userID.sendKeys("mngr227137");
		 
		 WebElement pswrd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		 pswrd.sendKeys("eqyruny");
		 
		 WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		 login.click();
		 
		 driver.manage().window().maximize();
		 
		 WebElement addNewCustomer = driver.findElement(By.cssSelector(".menusubnav > li:nth-child(2) > a:nth-child(1)"));
		 addNewCustomer.click();
		 
		 WebElement custName = driver.findElement(By.cssSelector(".layout > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > input:nth-child(1)"));
		 custName.sendKeys("Shyamly Sharma");
		 
		 WebElement genderF = driver.findElement(By.cssSelector(".layout > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(2) > input:nth-child(2)"));
		 genderF.click();
		 
		 WebElement dropdown = driver.findElement(By.cssSelector("li.dropdown:nth-child(1) > a:nth-child(1)"));
		 dropdown.click();
		 
		 WebElement index2 = driver.findElement(By.cssSelector("li.dropdown:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
		 System.out.println("index2 =" + index2.getText());
		 String I2 = "Radio & Checkbox Demo";
		 Assert.assertEquals(index2.getText(), I2);
		 index2.click();	
		 
		 WebElement radiobutton = driver.findElement(By.cssSelector("#vfb-7-3"));
		 radiobutton.click();
		 
		 WebElement checkbox1 = driver.findElement(By.cssSelector("#vfb-6-0"));
		 checkbox1.click();
		 
		 WebElement checkbox2 = driver.findElement(By.cssSelector("#vfb-6-1"));
		 checkbox2.click();
		 
		 WebElement checkbox3 = driver.findElement(By.cssSelector("#vfb-6-2"));
		 checkbox3.click(); 
				 
		 
	}
	 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\Firefox.exe");
	 driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
