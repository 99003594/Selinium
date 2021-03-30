package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.out.println("Welcome to Selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	/*WebElement firstname=driver.findElement(By.id("myTable"));
	String s=firstname.getText();
	System.out.println(s);*/
	//for entire row
	WebElement firstname=driver.findElement(By.xpath("//table//tbody//tr[1]"));
	String s=firstname.getText();
	System.out.println(s);
}
}
