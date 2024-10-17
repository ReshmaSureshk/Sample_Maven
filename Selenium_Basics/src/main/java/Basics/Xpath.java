package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement SearchButton = driver.findElement(By.xpath("//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@class='nav-input nav-progressive-attribute']"));
		SearchBox.sendKeys("Mobile");
	}
}
//parentTag[@attribute='value']
//We chose parent child because we got 2 of2 inorder to get 1 of 1 we need to get 2 criteria that points to the same
//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@class='nav-input nav-progressive-attribute']
//(//input[@class='nav-input nav-progressive-attribute'])[2] //By using index to get 1 of 1
		