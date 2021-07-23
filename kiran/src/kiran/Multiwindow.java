package kiran;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\seleniumSETUP\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Sushant/OneDrive/Desktop/multiwindow.html");
		
		driver.findElement(By.xpath("html/body/input[1]")).sendKeys("sushant");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Visit Facebook")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Visit Orange HRM")).click();
		Thread.sleep(3000);
		Set<String>A=driver.getWindowHandles();
		ArrayList<String> ls=new ArrayList<String>(A);
		driver.switchTo().window(ls.get(2));
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("patil");
	
		Thread.sleep(2000);
		String a=driver.getTitle();
		System.out.println(a);
		driver.switchTo().window(ls.get(0));
		Thread.sleep(2000);
		
	   
	   driver.switchTo().window(ls.get(1));
	   driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
	   Thread.sleep(3000);
	   String b=driver.getCurrentUrl();
	   System.out.println(b);
	   
	   driver.switchTo().window(ls.get(0));
	  
		
		
		
		

	}

}
