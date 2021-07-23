package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sush {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumSETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//driver.switchTo().frame(2);
		//driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
		
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("Actions")).click();
		
		WebElement wb=driver.findElement(By.xpath("//*[@name='packageFrame']"));
        driver.switchTo().frame(wb);
        driver.findElement(By.linkText("AddWebDriverSpecHeaders")).click();
	}

}
