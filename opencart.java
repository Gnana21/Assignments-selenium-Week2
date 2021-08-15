package assignments.selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("nadamg");
		driver.findElement(By.id("input-firstname")).sendKeys("Gnana");
		driver.findElement(By.id("input-lastname")).sendKeys("Prasuna");
		driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
		
		WebElement country = driver.findElement(By.id("input-country"));
	    Select country1 = new Select(country);
	    country1.selectByIndex(7);
	  
		driver.findElement(By.id("input-password")).sendKeys("Welcome123");
	}

}
