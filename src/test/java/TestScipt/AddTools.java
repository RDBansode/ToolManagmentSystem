package TestScipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddTools {

	public static void main(String[] args) {
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			//driver.get("http://tms.pisystindia.com/siteengineer/tools/addview");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("RD");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			driver.close();
		}catch (Exception e)
		{
			
		}
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
		    driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("abcd");//invalid alphabates
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("123");//invalid digits
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("RD");//valid data
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("");//blank
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("123");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("123");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			driver.close();
		}catch (Exception e)
		{
			
		}
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
		    driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			//Blank all details 
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			driver.close();
		}catch (Exception e)
		{
			
		}
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
		    driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			//Blank all details 
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			driver.close();
		}catch (Exception e)
		{
			
		}
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
		    driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			//all details filled with digits(invalid)rest of tool no valid 
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("1234");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("45678");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("1365");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("456");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("1234");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("1255");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			driver.close();
		}catch (Exception e)
		{
			
		}
		try {
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class=\"fa-solid fa-toolbox\"]")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id='component_name']")).sendKeys("Capacitor");
			driver.findElement(By.xpath("//input[@name=\"component_image\"]")).sendKeys("C:\\Users\\Admin\\Capacitor.JPEG");
			driver.findElement(By.xpath("//input[@id='component_code']")).sendKeys("1234");
			driver.findElement(By.xpath("//input[@id='component_material']")).sendKeys("AB");
			driver.findElement(By.xpath("//input[@id='component_description']")).sendKeys("rd");
			driver.findElement(By.xpath("//button [@onclick='return add()'])")).click();

		}catch (Exception e)
		{
			
		}
	try
			{
				ChromeOptions options = new ChromeOptions ();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver (options);
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
				driver.get("http://tms.pisystindia.com/siteengineer/login");
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class=\"fa-solid fa-cogs\"]")).click();
				driver.findElement(By.xpath("//a[@class=\"btn btn-outline-danger btn-flat btn-sm float-right\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"machine_name\"]")).sendKeys("Ac machine");
				driver.findElement(By.xpath("//input[@id=\"machine_no\"]")).sendKeys("1312");
				driver.findElement(By.xpath("//textarea[@id=\"machine_description\"]")).sendKeys("A14");
				driver.findElement(By.xpath("//input[@id=\"image\"]")).sendKeys("C:\\Users\\Admin\\Downloads\\ac machine.webp");
				driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
				Thread.sleep(5000);
				driver.close();
			}catch (Exception e)
			{
				
			}
 }
}
