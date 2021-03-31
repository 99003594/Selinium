package Day3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo1 {
	
	public static void main(String[] args) throws Exception 
	{
	
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		
		driver.findElement(By.id("user-message")).sendKeys("Geethika");
		//Thread.sleep(1000);
		driver.findElement(By.className("at-cm-no-button")).click();	
		driver.findElement(By.className("btn-default")).click();
		
		
		driver.findElement(By.id("sum1")).sendKeys("1");
		//Thread.sleep(1000);
		driver.findElement(By.id("sum2")).sendKeys("2");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/button")).click();
		
		
		//Scroll down syntax
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	}
}