package TestScipt;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DEMOQA_SIMPLE {

		public static void main(String[] args) {
			try
			{
				ChromeOptions options = new ChromeOptions ();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver (options);
				System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse_selenium-Shruti\\dragAndDrop\\chromedriver.exe");
				driver.get("https://demoqa.com/droppable/");
				driver.manage().window().maximize();
				
				WebElement DRAG=driver.findElement(By.id("draggable"));
				WebElement DROP=driver.findElement(By.id("droppable"));
				
				Actions action=new Actions(driver);
				action.dragAndDrop(DRAG, DROP).perform();
				
				
				//Code for taking the screenshot
				Date currentDate=new Date ();
				System.out.println(currentDate);
				String date=currentDate.toString().replace(" ", "-").replace(":", "_");
				System.out.println(date);
				File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot,new File(".//screenshot//"+date+".png"));
				
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}

	}
