package TestScipt;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) {
		try {
			
		 Date currentdate= new Date();
	     System.out.println(currentdate);
	     String date = currentdate.toString().replace(" ", "_").replace(":","_");
	     System.out.println(date);
	     ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     WebDriver driver = new ChromeDriver (options);
	 	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	     driver.get("https://jqueryui.com/");
	     driver.manage().window().maximize();
	     File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(screenshot,new File(".//screenshot//"+date+".png"));
	     Thread.sleep(1000);
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
