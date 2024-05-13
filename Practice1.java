package selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		
		
		
	}

}
