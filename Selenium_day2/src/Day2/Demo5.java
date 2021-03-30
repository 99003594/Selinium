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
		
		WebElement ele = driver.findElement(By.className("button-orange"));
	    Actions act = new Actions(driver);
		//act.dragAndDrop(ele, 5000).build().perform();
		//driver.close();	
	}
}