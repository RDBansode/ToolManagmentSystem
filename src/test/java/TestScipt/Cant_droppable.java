package TestScipt;

import java.io.File;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Cant_droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse_selenium-Shruti\\dragAndDrop\\chromedriver.exe");
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("Accepted Elements")).click();
			WebElement frame=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/p/iframe"));
			driver.switchTo().frame(frame);
			
			WebElement drag=driver.findElement(By.id("draggable-nonvalid"));
			WebElement drop=driver.findElement(By.id("droppable"));
			Actions action=new Actions(driver);
			action.dragAndDrop(drag,drop).perform();
			Thread.sleep(3000);
			
			//Code for taking the screenshot
			Date currentDate=new  Date (0);
			System.out.println(currentDate);
			String date=currentDate.toString().replace(" ", "-").replace(":", "_");
			System.out.println(date);
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot,new File(".//screenshot//"+date+".png"));

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

}
