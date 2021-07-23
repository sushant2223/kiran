package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\seleniumSETUP\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement wb=driver.findElement(By.xpath("//*[@id='day']"));
		Select sel=new Select(wb);
		sel.selectByValue("10");
		WebElement wb2=driver.findElement(By.xpath("//*[@id='month']"));
		Select sel1=new Select(wb2);
		sel1.selectByIndex(7);
		WebElement wb3=driver.findElement(By.xpath("//*[@id='year']"));
		Select sel2=new Select (wb3);
		sel2.selectByVisibleText("1994");
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		
		

	}

}
