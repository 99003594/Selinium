  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GEETHIKA\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("user-message")).sendKeys("Geethika");
		Thread.sleep(1000);
		driver.findElement(By.className("at-cm-no-button")).click();	
		driver.findElement(By.className("btn-default")).click();
	}
}