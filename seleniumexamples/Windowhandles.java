package seleniumexamples;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;
public class Windowhandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent  = driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> child = driver.getWindowHandles();
		for(String handles :child)
		{
			if(!handles.equals(parent))
			{
				driver.switchTo().window(handles);
				driver.findElement(By.id("firstName")).sendKeys("SAI");
				driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("PRASHANTH");
				driver.findElement(By.cssSelector("input[id=\"malerb\"]")).click();
				driver.findElement(By.id("englishchbx")).click();
				driver.findElement(By.cssSelector("[placeholder=\"Enter Email\"]")).sendKeys("saiprashanth@ssin24.com");
				driver.findElement(By.name("psw")).sendKeys("Saiprashanth@162001");
				driver.findElement(By.id("registerbtn")).click();
				driver.close();
				
			}
			
			
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("Vihaan");
		driver.close();
		
		
		
		

	}

}
