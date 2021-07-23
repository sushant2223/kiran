package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sushant {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumSETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement wb=driver.findElement(By.xpath("//*[@id='frame2']"));
		driver.switchTo().frame(wb);
		WebElement wb1=driver.findElement(By.xpath("//*[@id='animals']"));
        Select sel=new Select(wb1);
        sel.selectByValue("babycat");
        
        driver.switchTo().defaultContent();
        WebElement wb2=driver.findElement(By.xpath("//*[@id='frame3']"));
        driver.switchTo().frame(wb2);
        driver.findElement(By.xpath("//*[@id='a']")).click();
		
		
	}

}
