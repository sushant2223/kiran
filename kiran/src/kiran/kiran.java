package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class kiran {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumSETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement wb=driver.findElement(By.xpath("//*[@id='frame2']"));
		driver.switchTo().frame(wb);
		WebElement wb1=driver.findElement(By.xpath("//*[@id='animals']"));
		Select sel=new Select(wb1);
		sel.selectByValue("babycat");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("sushant");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame3");
		WebElement bb=driver.findElement(By.xpath("//*[@type='checkbox']"));
		bb.click();
		System.out.println(bb.isSelected());
		Thread.sleep(3000);
		
		

	}

}
