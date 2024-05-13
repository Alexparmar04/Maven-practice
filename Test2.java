package selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		
		WebElement phone=driver.findElement(By.id("mobile"));
		phone.sendKeys("9725312781");
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.name("user_password"));
		pass.sendKeys("9725312781");
		Thread.sleep(2000);
		
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		sub.click();
		Thread.sleep(1000);
		
				
		
		
		
		
	}

}
