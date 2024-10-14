package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		WebElement EmailId=driver.findElement(By.id("email"));
		EmailId.click();
		EmailId.sendKeys("kiara");
		
		WebElement Password= driver.findElement(By.name("pass"));
		Password.click();
		Password.sendKeys("123");
		//Password.clear();
		
		WebElement UserClassName = driver.findElement(By.className("inputtext _55r1 _6luy"));
		UserClassName.clear();
		
		
		

		
	}

}
