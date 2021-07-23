package kiran;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sir {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver","C:\\\\seleniumSETUP\\\\chromedriver_win32\\\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
  
   WebElement wb1=driver.findElement(By.xpath("//*[@id='box1']"));
   WebElement wb2=driver.findElement(By.xpath("//*[@id='box104']"));
   Actions act=new Actions(driver);
   act.dragAndDrop(wb1, wb2).release();
   
   WebElement wb3=driver.findElement(By.xpath("//*[@id='box7']"));
   WebElement wb4=driver.findElement(By.xpath("//*[@id='box3']"));
   act.dragAndDrop(wb3, wb4).release();
	
	
	}

}
