package week4day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] arg) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username"));
		WebElement usernameelement = driver.findElement(By.id("username"));
		usernameelement.sendKeys("Demosalesmanager");

		WebElement ElementPassword = driver.findElement(By.id("password"));
		ElementPassword.sendKeys("crmsfa");

		WebElement ElementloginButton = driver.findElement(By.className("decorativeSubmit"));
		ElementloginButton.click();

		WebElement Elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		Elementcrmsfa.click();

		WebElement Elementcontactbutton = driver.findElement(By.xpath("//*[text()='Contacts']"));
		Elementcontactbutton.click();

		WebElement Elementmergecontact = driver.findElement(By.xpath("//*[text()='Merge Contacts']"));
		Elementmergecontact.click();

		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>();
		handlesList.addAll(handles);
		driver.switchTo().window(handlesList.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(handlesList.get(0));
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following-sibling::a")).click();
		Set<String> handles1 = driver.getWindowHandles();
		List<String> handlesList1 = new ArrayList<String>();
		handlesList1.addAll(handles1);
		driver.switchTo().window(handlesList1.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(handlesList1.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());

	}

}
