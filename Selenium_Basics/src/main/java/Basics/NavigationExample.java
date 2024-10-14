package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/"); //here navigate store site history and cache 
		// get will wait till the page loads and navigate wont wait till the page loads fully
		driver.navigate().to("https://www.w3schools.com/");
		driver.navigate().back(); // to go back page
		driver.navigate().forward();// to go forward
		driver.navigate().refresh();
		driver.quit();// to close whole tab or to terminate whole tabs that are opened
		driver.close();//to close the current tab that is being used
		
		
	}

}
