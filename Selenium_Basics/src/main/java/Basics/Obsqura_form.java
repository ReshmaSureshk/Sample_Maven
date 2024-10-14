package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqura_form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement EnterMessage = driver.findElement(By.id("single-input-field"));
		EnterMessage.sendKeys("Hello All,Good morning");
		WebElement ShowMessage =driver.findElement(By.id("button-one"));
		ShowMessage.click();
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
