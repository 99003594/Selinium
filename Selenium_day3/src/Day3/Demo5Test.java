package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo5Test 
{
  @Test
	public void login() {
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
//		
//		driver.findElement(By.xpath("//section/div/div/div/div/div/div/ul/li[2]/a[@class=\"analystic\"]")).click();
//		WebElement ele= driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
//		driver.switchTo().frame(ele);
//		WebElement ele1= driver.findElement(By.xpath("/html/body/section/div/div"));
//		driver.switchTo().frame(ele1);
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Geethu");
//		
		
		
		driver.findElement(By.xpath("//section/div/div/div/div/div/div/ul/li[2]/a[@class=\"analystic\"]")).click();
		WebElement ele2= driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		driver.switchTo().frame(ele2);
		WebElement ele3= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(ele3);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Geethu");

}
}