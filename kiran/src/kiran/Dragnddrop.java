package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragnddrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\seleniumSETUP\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		WebElement wb1=driver.findElement(By.xpath("//*[text()='Draggable 1']"));
		WebElement wb2=driver.findElement(By.xpath("//*[@id='mydropzone']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(wb1, wb2).build().perform();

	}

}
