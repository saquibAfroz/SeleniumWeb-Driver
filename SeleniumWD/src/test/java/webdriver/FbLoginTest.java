package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


		WebElement UserName = driver.findElement(By.name("email"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Abc@1234");

		WebElement LoginBtn = driver.findElement(By.name("login"));
		LoginBtn.click();
		
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl()); 
		
		driver.close();
	}

}
