package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.out.println("Welcome to Selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//WebElement firstname=driver.findElement(By.name("txtUsername"));
	//firstname.sendKeys("Admin");
	WebElement firstname=driver.findElement(By.id("logInPanelHeading"));
	String s=firstname.getText();
	System.out.println(s);
}
}