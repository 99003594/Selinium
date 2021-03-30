package Day2;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Demo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		//for Home Loan Amount
		WebElement ele = driver.findElement(By.id("loanamountslider"));
	    Actions act = new Actions(driver);
		act.dragAndDropBy(ele,200,0).build().perform();
		
		//for Interest Rate
		WebElement ele1 = driver.findElement(By.id("loaninterestslider"));
	    Actions act1 = new Actions(driver);
		act1.dragAndDropBy(ele1,200,0).build().perform();
		
		//for Loan Tenure
		WebElement ele2 = driver.findElement(By.id("loantermslider"));
	    Actions act2 = new Actions(driver);
		act2.dragAndDropBy(ele2,200,0).build().perform();
	//driver.close();	
	}
}