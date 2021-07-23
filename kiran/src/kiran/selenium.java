package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumSETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//driver.switchTo().frame(2);
		//driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
		
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("Action")).click();
		
		WebElement wb=driver.findElement(By.xpath("//*[@name='classFrame']"));
		
		driver.switchTo().frame(wb);
		Thread.sleep(3000);
		driver.findElement(By.linkText("org.openqa.selenium.devtools.idealized")).click();
		
		
	
		
		
	
	}

}
