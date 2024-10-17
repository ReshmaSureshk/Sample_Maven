package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_Contains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//WebElement Href = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?ars=facebook')]"));
		//Href.click();//attribute contains is used here a portion from anywhere can be used here
		//WebElement StartWith=driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/recover/')]"));
		//StartWith.click(); //By using Starts with a portion from starting will be given
		WebElement StartWithText=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten account?')]"));
		StartWithText.click(); // by starting visible text
	}

}
//ul[@class='navbar-nav']//li[4]//a indexing 