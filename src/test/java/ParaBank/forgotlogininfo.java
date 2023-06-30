package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class forgotlogininfo {

	public static void main(String[] args) {
		
//1.Forgot login info
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//All valid Details.
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[1]/a")).click();
			driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Rushikesh");
			driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Bansode");
			driver.findElement(By.xpath("//input[@id=\"address.street\"]")).sendKeys("Wagholi");
			driver.findElement(By.xpath("//input[@id=\"address.city\"]")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id=\"address.state\"]")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@id=\"address.zipCode\"]")).sendKeys("412207");
			driver.findElement(By.xpath("//input[@id=\"ssn\"]")).sendKeys("311010127000");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//2.Forgot login info
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//Invalid (Blank)All details.
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[1]/a")).click();
			driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"address.street\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"address.city\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"address.state\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"address.zipCode\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"ssn\"]")).sendKeys("");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//3.Forgot login info
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			//Invalid (alphabets)Zipcode.Rest of all valid details.
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[1]/a")).click();
			driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Rushikesh");
			driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Bansode");
			driver.findElement(By.xpath("//input[@id=\"address.street\"]")).sendKeys("Wagholi");
			driver.findElement(By.xpath("//input[@id=\"address.city\"]")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id=\"address.state\"]")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@id=\"address.zipCode\"]")).sendKeys("ABCDE");
			driver.findElement(By.xpath("//input[@id=\"ssn\"]")).sendKeys("311010127000");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.close();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
//4.Forgot login info
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only digits)First name.Rest of  all valid details..
					driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[1]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("123456789");
					driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Bansode");
					driver.findElement(By.xpath("//input[@id=\"address.street\"]")).sendKeys("Wagholi");
					driver.findElement(By.xpath("//input[@id=\"address.city\"]")).sendKeys("Pune");
					driver.findElement(By.xpath("//input[@id=\"address.state\"]")).sendKeys("Maharastra");
					driver.findElement(By.xpath("//input[@id=\"address.zipCode\"]")).sendKeys("412207");
					driver.findElement(By.xpath("//input[@id=\"ssn\"]")).sendKeys("311010127000");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
//5.Forgot login info
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only character)SSN.Rest of all valid details.
					driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[1]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Rushikesh");
					driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Bansode");
					driver.findElement(By.xpath("//input[@id=\"address.street\"]")).sendKeys("Wagholi");
					driver.findElement(By.xpath("//input[@id=\"address.city\"]")).sendKeys("Pune");
					driver.findElement(By.xpath("//input[@id=\"address.state\"]")).sendKeys("Maharastra");
					driver.findElement(By.xpath("//input[@id=\"address.zipCode\"]")).sendKeys("412207");
					driver.findElement(By.xpath("//input[@id=\"ssn\"]")).sendKeys("ABCDE");
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
