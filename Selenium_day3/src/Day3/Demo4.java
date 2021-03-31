package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {
	public static void main(String[] args) throws Exception 
	{	
		System.out.println("Welcome to Selenium training");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		//maximising the firefix file
		driver.manage().window().maximize();
		//int size=driver.findElement(By.className("iframe"));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
		
		
		
		
		
		
		
		
	}
}