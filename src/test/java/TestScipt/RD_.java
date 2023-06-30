package TestScipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RD_ {

	public static void main(String[] args) {
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-Selenium\\TMS\\chromedriver.exe");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			//WebElement email = driver.findElement(By.xpath("input[@type=\"email\""));
			//email.sendKeys("siteengineer@gmail.com");
			WebElement email = driver.findElement(By.id("siteengineer_email"));
			email.sendKeys("siteengineer@gmail.com");
			WebElement pass = driver.findElement(By.id("siteengineer_password"));
			pass.sendKeys("123456");
			WebElement sign = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			sign.click();

			
			
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
