  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GEETHIKA\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.close();
	}
}