package kiran;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class i20 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumSETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']/following::input[1]")).sendKeys("sushant");
		driver.findElement(By.xpath("//*[@class='_6luy _55r1 _1kbt']/preceding::div[1]")).sendKeys("patil");
	
	}
	}