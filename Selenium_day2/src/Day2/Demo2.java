package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {
	public static void main(String[] args) throws Exception 
	{
	System.out.println("welcome to selenium");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.id("btnLogin")).click();
	//driver.findElement(By.className("firstLevelMenu")).click();
	driver.findElement(By.linkText("Maintenance")).click();
	//leave
	WebElement ele=driver.findElement(By.linkText("Leave"));
	Actions act= new Actions(driver);
	act.moveToElement(ele).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Leave")).click();
	//in leave Entitlements
	WebElement Ele4=driver.findElement(By.linkText("menu_leave_Entitlements"));
	Actions act4= new Actions(driver);
	act4.moveToElement(Ele4).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.linkText("menu_leave_Entitlements")).click();
	//in menu of entitlements add entitlements
	WebElement Ele5=driver.findElement(By.linkText("Add Entitlements"));
	Actions act5= new Actions(driver);
	act5.moveToElement(Ele5).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Add Entitlements")).click();
	//ptm
	WebElement Ele1=driver.findElement(By.linkText("PIM"));
	Actions act1= new Actions(driver);
	act1.moveToElement(Ele1).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.linkText("PIM")).click();
	//in ptm,menu_pim_viewEmployeeList
	WebElement Ele2=driver.findElement(By.linkText("menu_pim_viewEmployeeList"));
	Actions act2= new Actions(driver);
	act2.moveToElement(Ele2).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.linkText("menu_pim_viewEmployeeList")).click();
	}
} 