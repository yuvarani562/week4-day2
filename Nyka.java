package week4day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		WebElement elementclick = driver.findElement(By.xpath("//*[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(elementclick).perform();
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
		String title=driver.getTitle();
		if(title.contains("paris")) {
			
			System.out.println("Title contains paris");
		}
		else {
			System.out.println("Title does not contains paris");
			
		}
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'top rated')]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text=driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		if(text.contains("Shampoo")) {
			System.out.println("It contains shampoo");
			}
		else {
			System.out.println("It does not contains shampoo");
		}
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect ')]")).click();
		Set<String>winSet=driver.getWindowHandles();
		List<String>winList= new ArrayList<String>(winSet);
	    String text2=driver.findElement(By.xpath("//span[text()='MRP:']")).getText();
	    System.out.println(text2);
	
	    driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')][1]")).click();
	    Thread.sleep(3000);
	  
	    driver.findElement(By.xpath("//span[contains(text(),'Account')]/following::span")).click();
	    Thread.sleep(3000);
	    
	    String gt1=driver.findElement(By.xpath("//div[@class='firsr-col']")).getText();
	    String replaceAll = gt1.replaceAll("\\D", "");
	    int grandTotal = Integer.parseInt(replaceAll);
	    System.out.println("GrandTotal:"+grandTotal);
	    
	    
	    driver.findElement(By.xpath("//span[contains(text(),'PROCEED')]")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'GUEST')]")).click();
	    
	    String gt2= driver.findElement(By.xpath("//div[contains(text(),'Grand Total'/following::div[1]])")).getText();
	    String replaceAll2=gt2.replaceAll("\\D","");
	    int grandTotal2 = Integer.parseInt(replaceAll2);
	    System.out.println("GrandTotal:"+grandTotal2);
	    
	    if(grandTotal==grandTotal2) {
	    	
	    	System.out.println("Both are same");
	    }
	    else {
	    	System.out.println("Both are not same");
	    }
	    
	    driver.quit();
	    
	}	

}
