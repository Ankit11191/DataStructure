package prog1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test
{
	 public static void main(String args[])
	  {	
		 System.setProperty("webdriver.chrome.driver","C:/External_jars/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		List<WebElement> textbox= driver.findElements(By.name("q"));
		System.out.println(textbox.size());
		
		driver.quit();
	  }
}