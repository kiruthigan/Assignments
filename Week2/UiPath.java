package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		
		//1. Load url "https://acme-test.uipath.com/login"
		 driver.get("https://acme-test.uipath.com/login");
		//2. Enter email as "kumar.testleaf@gmail.com"
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//3. Enter Password as "leaf@12"
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		//4. Click login button
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		//5. Get the title of the page and print
		System.out.println(driver.getTitle());
		//6. Click on Log Out
		driver.findElement(By.linkText("Log Out")).click();
		//7. Close the browser (use -driver.close())
       // driver.close();
//invalid selector exception
		 //driver.findElement(By.className("btn btn-primary")).click();
	}

}
