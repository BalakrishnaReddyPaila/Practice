package firstpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Dump\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		WebElement w=driver.findElement(By.xpath("//a[@title='Electronics']"));
		new Actions(driver).moveToElement(w).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Lenovo")).click();
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();
	}
	

}
