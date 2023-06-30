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

public class Capitals_country {

	public static void main(String[] args) {
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.getProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\ToolManegmentSystem\\chromedriver.exe");
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			WebElement Rome = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
			WebElement Italy=driver.findElement(By.xpath("//div[@id=\"box106\"]"));
			
			WebElement Madrid = driver.findElement(By.xpath("//div[@id=\"box7\"]"));
			WebElement Spain=driver.findElement(By.xpath("//div[@id=\"box107\"]"));
			
			WebElement Copenhagen = driver.findElement(By.xpath("//div[@id=\"box4\"]"));
			WebElement Denmark =driver.findElement(By.xpath("//div[@id=\"box104\"]"));
			

			WebElement oslo  = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
			WebElement Norway =driver.findElement(By.xpath("//div[@id=\"box101\"]"));
			
			WebElement seoul  = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
			WebElement SouthKorea =driver.findElement(By.xpath("//div[@id=\"box105\"]"));
			
			WebElement Stokholm  = driver.findElement(By.xpath("//div[@id=\"box2\"]"));
			WebElement Sweden =driver.findElement(By.xpath("//div[@id=\"box102\"]"));
			
			WebElement US  = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
			WebElement washington =driver.findElement(By.xpath("//div[@id=\"box103\"]"));
			
			Actions action = new Actions(driver);
			action.dragAndDrop(Rome, Italy).perform();
			action.dragAndDrop(Copenhagen,Denmark).perform();
			action.dragAndDrop(US,washington).perform();
			action.dragAndDrop(Stokholm,Sweden).perform();
			action.dragAndDrop(oslo,Norway).perform();
			action.dragAndDrop(seoul,SouthKorea).perform();
			action.dragAndDrop(Madrid,Spain).perform();

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
