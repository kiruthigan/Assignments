package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException  {

		//Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://www.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();


		//Step 5: Add implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		//Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		//Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xyz");
		//Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		//Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Hello@123");
		//Step 11: Handle all the three drop downs

		WebElement birthdate = driver.findElement(By.id("day"));
		Select selectvalue = new Select(birthdate);

		selectvalue.selectByVisibleText("7");


		WebElement birthmonth = driver.findElement(By.id("month"));
		Select selectmonth = new Select(birthmonth);

		selectmonth.selectByVisibleText("Feb");

		WebElement birthyear = driver.findElement(By.id("year"));
		Select selectyear = new Select(birthyear);

		selectyear.selectByVisibleText("1992");
		//Step 12: Select the radio button "Female" 
		// ( A normal click will do for this step) 
		driver.findElement(By.className("_8esa")).click();


	}
}