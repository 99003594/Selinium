package Day3;

import org.testng.annotations.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1Test
{
	//@Test
	//@AfterClass
	@BeforeClass
 public void first()
 {
	 System.out.println("First method");
 }
	//@Test
	@AfterClass
	//@BeforeClass
 public void last()
 {
	 System.out.println("Last method");
 }
	@Test
  public void a()
  {
	System.out.println("a");
  }
  @Test
  public void b() 
  {
	  System.out.println("b");
  }
  @Test
  public void c()
  {
	  System.out.println("c");
  }
}





/*package Day3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1Test
{
  WebDriver driver;
  @Test
  public void z() 
  {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	 // System.out.println("I am in login page");
  }
  @Test(priority = 2,description = "verifying the credentials")
  public void y() 
  {
	  System.out.println("a");
//	  	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
	  //System.out.println("I am in home page");
  }
  @Test(priority = 3,description = "performing logout operation")
  public void x()
  {
	  System.out.println("b");
//	  driver.findElement(By.id("welcome")).click();
//	  driver.findElement(By.linkText("Logout")).click();
	  //System.out.println("I am in logout page");
  }
}*/


//package Day3;
//
//import org.testng.annotations.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Demo1Test
//{
//  WebDriver driver;
//  @Test(priority = 1)
//  public void z() 
//  {
//	  System.out.println("a");
//	  driver.findElement(By.id("a")).click();
///*//		System.out.println("Welcome to Selenoid");
////		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
////		driver=new FirefoxDriver();
////		driver.get("https://opensource-demo.orangehrmlive.com/");*/
//
//	 // System.out.println("I am in login page");
//  }
//  //@Test(priority = 2,description = "verifying the credentials",dependsOnMethods = "z")//this dependsOnMethods will skip the 'z' step
//  @Test(priority = 2,alwaysRun = true)
//  public void y() 
//  {
//	  System.out.println("b");
///*//	  	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
////		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
////		driver.findElement(By.id("btnLogin")).click();*/
//	  //System.out.println("I am in home page");
//  }
//  @Test(priority = 3,description = "performing logout operation",enabled = false)//if enabled = false not execute and if true then executes
//  public void x()
//  {
//	  System.out.println("c");
///*//	  driver.findElement(By.id("welcome")).click();
////	  driver.findElement(By.linkText("Logout")).click();*/
//	  //System.out.println("I am in logout page");
//  }
//}


