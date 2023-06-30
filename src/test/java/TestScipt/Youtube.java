package TestScipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-Selenium\\TMS\\chromedriver.exe");
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("RRR");
	driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
	driver.findElement(By.xpath("//div[@id='label-container']")).click();

	Thread.sleep(10000);
	//driver.close();	
}
catch (Exception e) {
	
}
	}

}
