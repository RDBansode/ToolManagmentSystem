package TestScipt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class textalert {
	public static void main(String[] args) {
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\ToolManegmentSystem\\chromedriver.exe");
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			//switching to the alert box
			Alert alert= driver.switchTo().alert();
			//reading text from alert box
			String textmessage=alert.getText();
			System.out.println(textmessage);
			Thread.sleep(2000);
			//alert.dismiss();
			alert.accept();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
}
}