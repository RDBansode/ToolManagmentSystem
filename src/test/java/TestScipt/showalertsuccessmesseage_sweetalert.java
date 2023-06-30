package TestScipt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class showalertsuccessmesseage_sweetalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\ToolManegmentSystem\\chromedriver.exe");
			driver.get("https://sweetalert2.github.io/");		
			driver.findElement(By.xpath("//button[@aria-label='Show SweetAlert2 success message']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			//switching to the alert box
			Alert alert= driver.switchTo().alert();
			//reading text from alert box
			String textmessage=alert.getText();
			System.out.println(textmessage);
			Thread.sleep(2000);
			//alert.dismiss();
			alert.accept();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
