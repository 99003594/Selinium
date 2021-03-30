package Day2;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Demo5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
	    	driver.manage().window().maximize(); //Element which needs to drag.
	    	WebElement Drag1=driver.findElement(By.id("credit"));	
	    	WebElement Drop1=driver.findElement(By.id("bank"));			
	    	Actions act1=new Actions(driver);							
	    	act1.dragAndDrop(Drag1, Drop1).build().perform();	
	    	WebElement Drag2=driver.findElement(By.id("fourth"));	
	    	WebElement Drop2=driver.findElement(By.id("amt7"));				
	    	Actions act2=new Actions(driver);					
	    	act2.dragAndDrop(Drag2, Drop2).build().perform();	 
	    	WebElement Drag3=driver.findElement(By.id("credit0"));	
	   	WebElement Drop3=driver.findElement(By.id("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol"));	
		//driver.close();	
	}
}
