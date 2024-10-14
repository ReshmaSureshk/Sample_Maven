package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		//WebElement ForgotPass = driver.findElement(By.linkText("Forgotten password?"));//link Text
		//ForgotPass.click();
		WebElement PartialForgot = driver.findElement(By.partialLinkText("Forgotten pass"));//Partial LinkText
		PartialForgot.click();

	}

}
