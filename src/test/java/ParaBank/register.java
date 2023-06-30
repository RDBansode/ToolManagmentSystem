package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class register {

	public static void main(String[] args) {
//1.register
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//All valid Details.
			driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("Rushikesh");
			driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]")).sendKeys("Bansode");
			driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("Wagholi");
			driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("412207");
			driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("7558584743");
			driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("311010127000");
			driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("Rushi1000");
			driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("rd2345");
			driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("rd2345");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//2.register
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//Invalid all(Blank) details. 
			driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//3.register
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			
			//Invalid (Doesn't match)password & confirm password.Restof all valid details.
			
			driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("Rushikesh");
			driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]")).sendKeys("Bansode");
			driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("Wagholi");
			driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("412207");
			driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("7558584743");
			driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("311010127000");
			driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("Rushi#1000");
			driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("rd@2345");
			driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("rd@2315");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//4.register
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//Invalid (only digits)First name.Rest valid details.
			driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]")).sendKeys("Bansode");
			driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("Wagholi");
			driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("412207");
			driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("7558584743");
			driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("311010127000");
			driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("Rushi#1000");
			driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("rd@2345");
			driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("rd@2345");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//5.register
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//Invalid (only character)SSN.Rest of all valid details.
			driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("Rushikesh");
			driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]")).sendKeys("Bansode");
			driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("Wagholi");
			driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("412207");
			driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("7558584743");
			driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("311010127000");
			driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("Rushi#1000");
			driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("rd@2345");
			driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("rd@2345");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}

}
