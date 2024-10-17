package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqura_Contains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoth\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement AutoSuccess=driver.findElement(By.xpath("//button[contains(text(),'Autoclosable success')]"));
		AutoSuccess.click();
		WebElement NormalWarning=driver.findElement(By.xpath("//button[contains(text(),'Normal warning')]"));
		NormalWarning.click();
		WebElement NormalInfo=driver.findElement(By.xpath("//button[contains(text(),'Normal info')]"));
		NormalInfo.click();

	}

}
