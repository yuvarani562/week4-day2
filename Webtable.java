package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	
	public static void main(String[] arg) {
	 WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver\r\n");
	   	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Hello");
	  driver.switchTo().frame(0);
	   driver.findElement(By.id("a")).click();
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(1);
	   WebElement clickelement = driver.findElement(By.id("Animals"));
	   Select se= new Select(clickelement);
	   se.selectByIndex(3);
	   
	   
	}
}
