package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement SignUp = driver.findElement(By.partialLinkText("Create new"));
		SignUp.click();

		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Saquib");

		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Afroz");

		WebElement EmailAddress = driver.findElement(By.name("reg_email__"));
		EmailAddress.sendKeys("abcd@xyz.com");

		WebElement Password = driver.findElement(By.id("password_step_input"));
		Password.sendKeys("Abcd@1234");

		// DOB
		WebElement day = driver.findElement(By.id("day"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("16");

		WebElement month = driver.findElement(By.id("month"));
		Select ddMonth = new Select(month);
		ddMonth.selectByVisibleText("Aug");

		WebElement year = driver.findElement(By.id("year"));
		Select ddYear = new Select(year);
		ddYear.selectByVisibleText("1997");

		// Gender Radio Button
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']")); // (By.xpath("//input[@name='sex'and
																					// @value='2']"));
		gender.click();

		WebElement Submit = driver.findElement(By.name("websubmit")); // (By.xpath("//button[@name='websubmit']"));
		Submit.click();

		// Print all the months value from month Dropdown
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("First month is " + months.get(0).getText());
		System.out.println("Second month is " + months.get(1).getText());

		for (WebElement m : months) {
			System.out.println(m.getText());
		}

		// Find Total number of link on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of link are "+links.size());
	}

}
