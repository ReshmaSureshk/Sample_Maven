package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqura_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement EnterMessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		EnterMessage.sendKeys("hello,This is my third Assignment using Xpath");
		WebElement ShowMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		ShowMessage.click();
		//driver.close();
		

	}

}
