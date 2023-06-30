package TestScipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DEMQOQA_REVERT {


	public static void main(String[] args) {
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse_selenium-Shruti\\dragAndDrop\\chromedriver.exe");
			driver.get("https://demoqa.com/droppable/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("droppableExample-tab-revertable")).click();
			
			WebElement drag=driver.findElement(By.xpath("//div[@id='revertable']"));
			WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/div[2]"));
			Actions action=new Actions(driver);
			action.dragAndDrop(drag,drop).perform();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}