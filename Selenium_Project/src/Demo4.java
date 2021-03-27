import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo4 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GEETHIKA\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
}