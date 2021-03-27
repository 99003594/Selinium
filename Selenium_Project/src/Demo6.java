import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Welcome to Selenium training");
		//"C:\Users\Training\Downloads\chromedriver_win32\chromedriver.exe"(we have to make the single slash to double)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GEETHIKA\\Desktop\\chromedriver.exe");//our chrome installed file path
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");//our launcher file of chrome(http link)
	driver.manage().window().maximize();
	Select dd= new Select(driver.findElement(By.id("select-demo")));
	dd.selectByVisibleText("Sunday");
	Thread.sleep(1000);
	dd.selectByValue("Friday");
	Thread.sleep(1000);
	dd.selectByIndex(3);
	Thread.sleep(1000);
	Select pd= new Select(driver.findElement(By.id("multi-select")));
	pd.selectByValue("California");
	//Thread.sleep(1000);
	pd.selectByValue("Florida");
	driver.findElement(By.className("btn-primary")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("btn btn-primary")).click();
	driver.close();
	}
}