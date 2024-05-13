package selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9302006%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAjww_iwBhApEiwAuG6ccHSCYHcEyKDJp03LzJGhFcyJV2IUWcqmnzUWAg3IuqwZEbDqaRxpFxoCaUAQAvD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Alex");
		Thread.sleep(1000);
		
		WebElement Lname=driver.findElement(By.name("lastname"));
		Lname.sendKeys("Parmar");
		Thread.sleep(1000);
		
		WebElement reg=driver.findElement(By.name("reg_email__"));
		 reg.sendKeys("parmaralex1997@gmail.com");
		 Thread.sleep(1000);
		
		WebElement reg1=driver.findElement(By.name("reg_email_confirmation__"));
		 reg1.sendKeys("parmaralex1997@gmail.com");
		 Thread.sleep(1000);
		
		WebElement pass=driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("ABS");
		Thread.sleep(2000);
		
		WebElement day1=driver.findElement(By.name("birthday_day"));
		Select days=new Select(day1);
		days.selectByVisibleText("6");
		Thread.sleep(2000);
		
		WebElement month1 = driver.findElement(By.name("birthday_month"));
		Select month = new Select(month1);
		month.selectByVisibleText("May");
		Thread.sleep(2000);
		
		WebElement year1=driver.findElement(By.name("birthday_year"));
		Select year = new Select (year1);
		year.selectByVisibleText("1997");
		Thread.sleep(2000);
		
		// List<WebElement>list= (List<WebElement>) driver.findElements(By.id("u_0_5_yb"));
		 //list.get(1).click(); 
		//Thread.sleep(1000);
		
		//WebElement select = driver.findElement(By.id("gender-help"));
		//java.util.List<WebElement> list = driver.findElements(By.id("u_0_5_gN"));
		//list.get(1).click();
		
		 WebElement submit=driver.findElement(By.name("websubmit"));
		 submit.click();
		 Thread.sleep(2000);
		 
		 driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
