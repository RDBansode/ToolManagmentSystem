package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
//1.Login 
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//All valid Details.
			driver.findElement(By.xpath("//input [@name=\"username\"]")).sendKeys("Rushi1000");
			driver.findElement(By.xpath("//input [@name=\"password\"]")).sendKeys("rd2345");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input [@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//2.Login 
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (Blank)All details.					
					driver.findElement(By.xpath("//input [@name=\"username\"]")).sendKeys("");
					driver.findElement(By.xpath("//input [@name=\"password\"]")).sendKeys("");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input [@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
//3.Login 
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only alphabets)Username.Rest of all details.
					driver.findElement(By.xpath("//input [@name=\"username\"]")).sendKeys("Rushi");
					driver.findElement(By.xpath("//input [@name=\"password\"]")).sendKeys("rd@2345");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input [@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				
	            }
//4.Login 
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only alphabets)password.Rest of all details.
					driver.findElement(By.xpath("//input [@name=\"username\"]")).sendKeys("Rushi#1000");
					driver.findElement(By.xpath("//input [@name=\"password\"]")).sendKeys("rdx");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input [@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
//5.Login 
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only special symbol)password.Rest of all details.
					driver.findElement(By.xpath("//input [@name=\"username\"]")).sendKeys("Rushi#1000");
					driver.findElement(By.xpath("//input [@name=\"password\"]")).sendKeys("@#$%^");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input [@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
     }
	}
