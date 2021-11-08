package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL 	
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		//https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Step 6: Fill in all the text boxes
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("abc.xyz@gmail.com");
		driver.findElement(By.xpath("//div[@class='field']/input[1]")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("1234567890");
		
		// Step 7: Handle all the dropdowns
		WebElement employees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select employeesize = new Select(employees);
		employeesize.selectByVisibleText("1501+ employees");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select countrydrp = new Select(country);
		countrydrp.selectByVisibleText("India");
	
		// Step 8: Click the check box
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		
		// Step 9: Close the browser
	    driver.close();
		
		//*Note: No need click Start my freeTrial
	}

}
