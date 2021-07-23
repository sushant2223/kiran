package kiran;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\seleniumSETUP\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Sushant/OneDrive/Desktop/multiwindow.html");
		
        driver.findElement(By.linkText("Visit Orange HRM")).click();
        Set<String>a=driver.getWindowHandles();
        ArrayList<String> ls=new ArrayList<String>(a);
        driver.switchTo().window(ls.get(1));
        driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("patil");
        driver.switchTo().window(ls.get(0));
        driver.findElement(By.xpath("html/body/input[1]")).sendKeys("sushant");
        driver.close();
        
        
		
		
		
		


}
}