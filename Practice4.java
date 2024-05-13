package selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice4 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		Thread.sleep(1000);
		
		
		

	}

}
