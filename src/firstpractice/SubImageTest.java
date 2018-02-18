package firstpractice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubImageTest 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Dump\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		Thread.sleep(3000 );
		WebElement w=driver.findElement(By.id("hplogo"));
		Point p=w.getLocation();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage bi=ImageIO.read(f);
		BufferedImage logo=bi.getSubimage(p.getX(), p.getY(), w.getSize().width, w.getSize().height);
		ImageIO.write(logo, "png", f);
		FileUtils.copyFile(f, new File("subimg.png"));
		
		
	}

}
