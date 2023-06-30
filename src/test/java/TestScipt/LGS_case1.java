package TestScipt;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LGS_case1 {

	public static void main(String[] args) {
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");//Valid Gmail
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");//Invalid password
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(3000);
     driver.close();
 }
 catch(Exception e) {
	 e.getStackTrace();
 }
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	//Valid Gmail and Blank password
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	 e.getStackTrace();
}
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");//Blank
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");//Blank
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	 e.getStackTrace();
}
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("steengineer@gmail.com");//Incorrect Gmail
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");////Incorrect Password
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	 e.getStackTrace();
}
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");//Invalid Gmail
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");//Only alphabates
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	 e.getStackTrace();
}
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");//Valid Gmail
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@#$%");//Only Special Charater
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	
}
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123456");//Only number
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");//Blank
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	 e.getStackTrace();
}
 try {
	 ChromeOptions options =new ChromeOptions ();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver (options);
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
	 driver.get("http://tms.pisystindia.com/siteengineer/login");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc123");//only alphanumeric
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");//valid password
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
     driver.close();
}
catch (Exception e ) {
	 e.getStackTrace();
}

	try {
		 ChromeOptions options =new ChromeOptions ();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver (options);
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
		 driver.get("http://tms.pisystindia.com/siteengineer/login");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");//Valid Gmail
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");//only alphanumeric
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(2000);
	     driver.close();
	}
	catch (Exception e ) {
		 e.getStackTrace();
	}
	try {
		 ChromeOptions options =new ChromeOptions ();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver (options);
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
		 driver.get("http://tms.pisystindia.com/siteengineer/login");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");//only alphates
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@#$%");//only special charater
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(2000);
	     driver.close();
	}
	catch (Exception e ) {
		 e.getStackTrace();
	}
	}

}
