package selenium.maven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("parmaralex97@yahoo.in");
		TakeScreenshot ts=(TakeScreenshot)driver;
		File file=ts.getscreenshotAS(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshot/image.png"));
		

	}

}
