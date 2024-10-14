package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		WebElement SearchText = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		SearchText.sendKeys("Mobile");
		SearchText.clear();
		WebElement SearchClass = driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		SearchClass.sendKeys("Books");
		
	}

}
