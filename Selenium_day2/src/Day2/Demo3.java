package Day2;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");

		WebElement Ele = driver.findElement(By.className("range"));
		Actions act = new Actions(driver);
		act.click().dragAndDropBy(Ele,0,0).build().perform();
	//driver.close();	
	}
}