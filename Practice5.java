package selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice5 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.className("button")).click();
		Thread.sleep(1000);

	}

}
