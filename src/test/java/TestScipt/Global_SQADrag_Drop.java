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

public class Global_SQADrag_Drop {
		public static void main(String[] args) {
			try
			{
				ChromeOptions options = new ChromeOptions ();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver (options);
				System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse_selenium-Shruti\\dragAndDrop\\chromedriver.exe");
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
				driver.manage().window().maximize();
				
				WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
				driver.switchTo().frame(frame);
				
				WebElement HighTatras = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
				WebElement Trash1 = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
				Actions action=new Actions(driver);
				action.dragAndDrop(HighTatras, Trash1).perform();
				
				WebElement HighTatras2 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
				WebElement Trash2 = driver.findElement(By.id("trash"));
				Actions action2=new Actions(driver);
				action2.dragAndDrop(HighTatras2, Trash2).perform();
				
				WebElement HighTatras3 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
				WebElement Trash3 = driver.findElement(By.id("trash"));
				Actions action3=new Actions(driver);
				action3.dragAndDrop(HighTatras3, Trash3).perform();
				
				WebElement HighTatras4 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
				WebElement Trash4 = driver.findElement(By.id("trash"));
				Actions action4=new Actions(driver);
				action4.dragAndDrop(HighTatras4, Trash4).perform();
				
				Thread.sleep(3000);
				
				//screenshot
				Date currentDate=new  Date ();
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
