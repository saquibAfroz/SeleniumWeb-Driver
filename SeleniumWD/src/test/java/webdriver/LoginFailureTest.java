package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailureTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver(); // for firefox browser
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@1234");

		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();

		WebElement LoginBtn = driver.findElement(By.name("btnlogin"));
		LoginBtn.click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement Error = driver.findElement(By.className("error_msg"));
		System.out.println(Error.getText());
		

	}

}
