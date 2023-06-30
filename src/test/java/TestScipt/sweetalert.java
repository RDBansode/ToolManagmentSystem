package TestScipt;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sweetalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\ToolManegmentSystem\\chromedriver.exe");
			driver.get("https://sweetalert2.github.io/");
		
			driver.findElement(By.xpath("//button[text()='Show normal alert']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-danger\']")).click();
			//switching to the alert box
			Alert alert= driver.switchTo().alert();
			//reading text from alert box
			String textmessage=alert.getText();
			System.out.println(textmessage);
			alert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
