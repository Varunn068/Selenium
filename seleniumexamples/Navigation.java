package seleniumexamples;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("SAI");
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("PRASHANTH");
		driver.findElement(By.cssSelector("input[id=\"malerb\"]")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.cssSelector("[placeholder=\"Enter Email\"]")).sendKeys("saiprashanth@ssin24.com");
		driver.findElement(By.name("psw")).sendKeys("Saiprashanth@162001");
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
