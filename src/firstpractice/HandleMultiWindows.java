package firstpractice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultiWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Dump\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		//driver.findElement(By.xpath("//*[@class='btn btn-default redBtn']")).click();
		driver.switchTo().window(lst.get(0));
	}

}
