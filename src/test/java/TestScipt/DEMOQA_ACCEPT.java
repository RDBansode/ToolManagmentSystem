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

public class DEMOQA_ACCEPT {

			public static void main(String[] args) {
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse_selenium-Shruti\\dragAndDrop\\chromedriver.exe");
					driver.get("https://demoqa.com/droppable/");
					driver.manage().window().maximize();
					
					driver.findElement(By.id("droppableExample-tab-accept")).click();
					
					WebElement drag=driver.findElement(By.xpath("//div[@id='acceptable']"));
					WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]"));
					Actions action=new Actions(driver);
					action.dragAndDrop(drag,drop).perform();
					
					//Code for taking the screenshot
					Date currentDate=new  Date ();
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
