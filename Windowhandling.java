package week4day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {
       public static void main(String[] arg) throws InterruptedException {
    	   
    	   WebDriverManager.chromedriver().setup();
    	   ChromeDriver driver=new ChromeDriver();
    	   driver.get("http://www.leafground.com/pages/Window.html");
    	   
    	   driver.manage().window().maximize();
    	   driver.findElement(By.id("home"));
    	   WebElement elementclick = driver.findElement(By.id("home"));
    	   elementclick.click();
    	   
    	   driver.findElement(By.xpath("//*[text()=\'Open Multiple Windows\']")).click();
    	   
    	   driver.findElement(By.id("color")).click();
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       }
       
	
	
	
	
	
	
	
	
	
}
