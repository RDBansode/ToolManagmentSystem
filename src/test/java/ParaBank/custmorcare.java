package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class custmorcare {

	public static void main(String[] args) {
		//1.Customer Care
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//All valid Details.
					driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Rushikesh");
					driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rdbansode2001@gmail.com");
					driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("7558584743");
					driver.findElement(By.xpath("//input[@id=\\\"message\\\"]")).sendKeys("ABCD@#222$%");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
//2.Customer Care
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only digits)message.Rest all details.
					driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Rushikesh");
					driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rdbansode2001@gmail.com");
					driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("7558584743");
					driver.findElement(By.xpath("//input[@id=\\\"message\\\"]")).sendKeys("12345");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
//3.Customer Care
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only character)Phone.Rest all details.
					driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Rushikesh");
					driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rdbansode2001@gmail.com");
					driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@id=\\\"message\\\"]")).sendKeys("ABCD@#222$%");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
//4.Customer Care
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid (only digits)First name.Rest valid details.
					driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rdbansode2001@gmail.com");
					driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("7558584743");
					driver.findElement(By.xpath("//input[@id=\\\"message\\\"]")).sendKeys("ABCD@#222$%");
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
					Thread.sleep(1000);
					driver.close();
				}catch (Exception e)
				{
					e.getStackTrace();
				}
				//5.Customer Care
				try
				{
					ChromeOptions options = new ChromeOptions ();
					options.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver (options);
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
					driver.get("https://parabank.parasoft.com/parabank/register.htm");
					//Invalid all(Blank) details. 
					driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a")).click();
					driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("");
					driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("");
					driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("");
					driver.findElement(By.xpath("//input[@id=\\\"message\\\"]")).sendKeys("");
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
