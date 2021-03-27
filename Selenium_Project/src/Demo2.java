import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GEETHIKA\\Desktop\\chromedriver.exe");//our chrome installed file path
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");//our launcher file of chrome(http link)
	driver.manage().window().maximize();
	driver.findElement(By.className("btn-default")).click();//clicking on first clickme
	driver.switchTo().alert().accept();//clicking on ok
	Thread.sleep(1000);//waiting for some time
	driver.findElement(By.className("btn-lg")).click();//clicking on second clickme
	driver.switchTo().alert().accept();//clicking on second ok
	Thread.sleep(1000);
	driver.findElement(By.className("btn-default btn-lg")).click();
	}
}
