package firstpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllTheLinks {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Dump\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Balu");
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(3000);
		
		List<WebElement>lst=driver.findElements(By.xpath("//a[starts-with(text(),'Balu') or starts-with(text(),'balu')]"));
		for(WebElement w: lst) {
			System.out.println(w.getText());
		}
		System.out.println("=================");
		List<WebElement>lst1=driver.findElements(By.xpath("//a[contains(text(),'Wikipedia')]"));
		for(WebElement w1: lst1) {
			
			System.out.println(w1.getText());
		}
		
		/*List<WebElement> lst2=driver.findElements(By.xpath("//*[ends-with(text(),'pedia')]"));
		for(WebElement w2: lst2) {
			System.out.println(w2.getText());
		}*/
			
	}

}
