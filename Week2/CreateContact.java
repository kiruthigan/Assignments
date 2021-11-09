package week2.day2;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//Maximize window
		driver.manage().window().maximize();

		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();

		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Ruby");

		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Mary");

		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("RM");

		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");

		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");

		// Enter Description Field Using any Locator of your choice 
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Creating a contact in testleaf application");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement SelectState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(SelectState);
		state.selectByVisibleText("Alaska");

		// Click on Create Contact
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		//click on edit button 
		driver.findElement(By.linkText("Edit")).click();

		//Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();

		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important");

		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		//Get the Title of Resulting Page.
		System.out.println(driver.getTitle());


	}

}
