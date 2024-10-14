package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver(); //run time polymorphism
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String title= driver.getTitle(); //to get title of the page
		System.out.println(title);
		String currenturl=driver.getCurrentUrl(); //to get current url
		System.out.println(currenturl);
		driver.get(currenturl); // for refreshing the page or url
		
	}

}
