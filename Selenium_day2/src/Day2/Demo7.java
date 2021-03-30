package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.out.println("Welcome to Selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	//for entire table
	/*WebElement firstname=driver.findElement(By.id("myTable"));
	String s=firstname.getText();
	System.out.println(s);*/
	/*//for first row first element
	WebElement firstname=driver.findElement(By.xpath("//tbody//tr[1]//td[2]"));
	String s=firstname.getText();
	System.out.println(s);*/
	/*//for entire row
		WebElement firstname=driver.findElement(By.xpath("//table//tbody//tr[1]"));
		String s=firstname.getText();
		System.out.println(s);*/
		WebElement firstname=driver.findElement(By.xpath("//table//thead//tr//th[2]"));
		String s=firstname.getText();
		System.out.println(s);
}
}