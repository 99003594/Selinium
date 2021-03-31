package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	public static void main(String[] args) throws Exception 
	{	
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Training\\\\Downloads\\\\geckodriver-v0.29.0-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		//maximising the firefix file
		driver.manage().window().maximize();
		
		driver.findElement(By.className("btn-default")).click();//clicking on first clickme
		Thread.sleep(2000);//waiting for some time
		driver.switchTo().alert().accept();//clicking on ok
		Thread.sleep(2000);//waiting for some time
		
		driver.findElement(By.className("btn-lg")).click();//clicking on second clickme
		Thread.sleep(2000);//waiting for some time
		driver.switchTo().alert().accept();//clicking on second ok
		Thread.sleep(2000);//waiting for some time
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(500);
		driver.switchTo().alert().sendKeys("Geethu");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		
		
		//scrolling of the firefox file
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
}
