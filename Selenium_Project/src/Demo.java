import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Demo {
		public static void main(String[] args) throws InterruptedException {
			System.out.println("Welcome");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\GEETHIKA\\Desktop\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();  
			//driver.findElement(By.name("txtUsername")).sendKeys("Geethika");
			//Thread.sleep(500);
			//driver.findElement(By.id("txtPassword")).sendKeys("Geethu");
			driver.get("https://opensource-demo.orangehrmlive.com/");  
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			Thread.sleep(500);
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		}
	}