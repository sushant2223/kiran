package kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumSETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		WebElement wb=driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		Actions act=new Actions(driver);
		act.doubleClick(wb).build().perform();
		WebElement wb1=driver.findElement(By.xpath("//*[@id='doubleClickMessage']"));
		String a=wb1.getText();
		System.out.println(a);
		driver.close();
		

	}

}
