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

public class JQUERY_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.getProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\ToolManegmentSystem\\chromedriver.exe");
			driver.get("https://jqueryui.com/sortable/");
			WebElement droppabale=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a"));
			droppabale.click();
			WebElement frame=driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/droppable/default.html\" ]"));
			driver.switchTo().frame(frame);
			WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
			WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
			Actions action = new Actions(driver);
			action.dragAndDrop(drag, drop).perform();
			Thread.sleep(2000);
			Date currentdate= new Date();
		    System.out.println(currentdate);
		    String date = currentdate.toString().replace(" ", "_").replace(":","_");
		     System.out.println(date);
			File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot,new File(".//screenshot//"+date+".png"));
			driver.close();
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
